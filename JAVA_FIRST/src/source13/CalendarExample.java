package source13;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println("year 변수값 = " + year);
		
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day + "일");
		
		// 1을 일요일 인식
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
//		case Calendar.SUNDAY:
//			strWeek = "일";
//			break;

		default:
			strWeek = "일";
			break;
		}
		System.out.println("오늘은 " + strWeek + "요일");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		System.out.println("지금은 " + strAmPm + "입니다.");
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("지금은 " + strAmPm + hour + "시 입니다.");
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println("지금은 " + strAmPm + hour + "시" + minute + "분 입니다.");

		int second = now.get(Calendar.SECOND);
		System.out.println("지금은 " + strAmPm + hour + "시" + minute + "분" + second+ "초 입니다.");
	}
}
