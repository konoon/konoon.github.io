package source08_class_ex.exam01;

class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		this.speed += value;
		if(speed > 100) {
			System.out.println("제한속도를 초과하셨습니다. 속도를 100으로 낮춥니다.");
			speed = 100;
		}
	}
	
	void downSpeed(int value) {
		this.speed -= value;
	}
}

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "연두색";
		myCar.speed = 0;
		
		System.out.println("나의 자동차 색상은" + myCar.color + "입니다");
		
		myCar.upSpeed(30);
		System.out.println("myCar 속도는 " + myCar.speed + "입니다.");

		myCar.upSpeed(60);
		System.out.println("myCar 속도는 " + myCar.speed + "입니다.");

		myCar.upSpeed(150);
		System.out.println("myCar 속도는 " + myCar.speed + "입니다.");
		
		myCar.downSpeed(30);
		System.out.println("myCar 속도는 " + myCar.speed + "입니다.");
	}

}
