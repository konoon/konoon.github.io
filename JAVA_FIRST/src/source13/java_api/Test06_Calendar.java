package source13.java_api;

import java.util.Calendar;
import java.util.Date;

public class Test06_Calendar {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		System.out.println("지금은 " + c.get(Calendar.YEAR) + "년 입니다.");
		System.out.println("이번달은 " + (c.get(Calendar.MONTH) + 1) + "월 입니다.");
		System.out.println("오늘은 " + c.get(Calendar.DAY_OF_MONTH) + "일 입니다.");
		System.out.println("현재시간은 " + c.get(Calendar.HOUR) + "시 입니다.");
		System.out.println("현재시간은 " + c.get(Calendar.HOUR_OF_DAY) + "시 입니다.");
		System.out.println("지금은 " + c.get(Calendar.MINUTE) + "분 입니다.");
//		System.out.println("지금은 " + c.get(Calendar.SECOND) + "초 입니다.");
	}

}
