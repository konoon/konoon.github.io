package source13.java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test09_SimpleDateFormat {

	public static void main(String[] args) {
		// 패턴 기호 설명(대소문자 구문해야함)
		// y(년), M(월), w(월 구분 없는 주), W()주, d(일), D(월 구분 없는 일), E(요일), a(오전과 오후), h(시간: 1~12), H(시간: 0~23), k(시간: 1~24), K(시간: 0~11), m(분), s(초), S(밀리초), z(타임존)
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a z");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d = sdf2.parse("2023-02-28");
		} catch (ParseException e) { }
		System.out.println(sdf.format(d));
	}

}
