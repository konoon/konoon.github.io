package source09_inheritance;

// 타입 변환을 이용한 다형성

class Vehicle {
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는 탈 것이다.");
	}

	// static은 메서드 오버라이딩 안됨
	static void move() {
		System.out.println("이동하다.");
	}
}

class Car5 extends Vehicle {
	String name = "자동차";

	@Override
	void whoami() {
		System.out.println("나는 자동차이다");
	}
	
	static void move() {
		System.out.println("달리다.");
	}
}

public class Test11 {
	public static void main(String[] args) {
		Vehicle v = new Car5();
		System.out.println(v.name); 
		v.whoami(); // 재정의 된 것들만 바뀜..?
		
		v.move();
		Vehicle.move();
		Car5.move();
		
		System.out.println("=============");
		
		Car5 c = new Car5();
		System.out.println(c.name);
		c.whoami();
		
		c.move();
		Vehicle.move();
		Car5.move();
		
	}

}
