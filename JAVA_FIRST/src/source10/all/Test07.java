package source10.all;

// 추상 클래스, 추상메서드 활용

abstract class Car8 {
	int speed = 0;
	String color;
	
	abstract void work();
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan8 extends Car8 {
	@Override
	void work() {
		System.out.println("승용차가 사람들 태우고있습니다.");
	}
}

class Truck8 extends Car8 {
	@Override
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
	
}

public class Test07 {
	public static void main(String[] args) {
		Sedan8 sedan = new Sedan8();
		sedan.work();
		
		Truck8 truck = new Truck8();
		truck.work();
	}
}
