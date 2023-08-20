package study;

public class exam04 {
	public static void main(String[] args) {
		int hour = 10;
		boolean isSmallCar = true;
		boolean withDisabledPerson = true;
		
		int fee = hour * 4000;
		if (fee > 30000) {
			fee = 30000;
		}
		
		if (isSmallCar || withDisabledPerson) {
			fee /= 2;
		}
		
		System.out.println("주차 요금은 " + fee + "원 입니다.");
	}
}
