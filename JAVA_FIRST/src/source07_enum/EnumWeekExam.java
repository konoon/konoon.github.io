package source07_enum;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언
		Calendar cal = Calendar.getInstance();
		int weekend = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지 숫자 리턴

		System.out.println(weekend);
		
		switch (weekend) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FIRDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("이번 년도는  " + year + "년 입니다.");
		
		int month = cal.get(Calendar.MONTH) + 1; // Calendar.MONTH는 월을 0~11로 리턴하는 것
		System.out.println("이번달은  " + month + "월 입니다."); // 컴퓨터는 0부터 시작을 해서 6월 = 5로 나와서 뒤에 +1을 해줘야함
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("오늘은 " + month  + "월 " + day + "일입니다.");
		
		int weekex = cal.get(Calendar.DAY_OF_WEEK); // Calendar.DAY_OF_WEEK 주단위 일요일(1)~토요일(7)로 리턴
		System.out.println("오늘은 " + weekex + " 일입니다."); // 컴퓨터가 인식하는 요일 목요일 = 5
		System.out.println(today);
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println("지금은 " + hour + "시 입니다.");
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("지금은 " + hour + "시 " + minute + "분 입니다.");

		int second = cal.get(Calendar.SECOND);
		System.out.println("지금은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
	}

}
