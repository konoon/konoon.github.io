package source10.all;

import java.util.Scanner;

class Car6 {
	int speed = 0;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(슈퍼클래스) : " + this.speed);
	}
}

class Sedan6 extends Car6 {
	@Override
	void upSpeed(int speed) {
		this.speed = speed;
		if(this.speed > 150) {
			this.speed = 150;
		}
		System.out.println("현재속도(서브클래스) : " + this.speed);
	}
}

class Truck6 extends Car6 {
	
}

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("트럭 속도 입력");
		int speed1 = scan.nextInt();
		System.out.println("세단 속도 입력");
		int speed2 = scan.nextInt();
		
		Truck6 truck = new Truck6();
		truck.upSpeed(speed1);
		System.out.println("현재 트럭의 속도는 : " + truck.speed + "km 입니다.");
		
		Sedan6 sedan = new Sedan6();
		sedan.upSpeed(speed2);
		System.out.println("현재 승용차의 속도는 : " + sedan.speed + "km 입니다.");
		
		scan.close();
	}
}
