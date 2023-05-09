package source13;

import java.text.SimpleDateFormat;
import java.util.Date;

// 현재 날짜 출력
public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
