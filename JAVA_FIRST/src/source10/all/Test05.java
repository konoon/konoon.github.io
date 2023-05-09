package source10.all;

import java.util.Scanner;

// 상속을 제한하는 private 활용 예시

class Car4 {
	private String color;
//	protected String color;
	int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Sedan4 extends Car4 {
	void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void setColor(String color) {
		super.setColor(color);
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("승용차의 현재 속도입력==>");
		int speed = scan.nextInt();
		System.out.println("승용차의 색상입력==>");
		String color = scan.next();
		
		Sedan4 sedan = new Sedan4();
		sedan.setSpeed(speed);
		System.out.println("승용차의 속도는 " + sedan.speed + "km입니다.");
		
		sedan.setColor(color);
		System.out.println("승용차의 색상은" + sedan.getColor() + "입니다.");
	}

}
