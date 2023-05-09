package source10.all;

class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		this.speed += value;
	}
	
	void downSpeed(int value) {
		this.speed -= value;
	}
}

class Sedan extends Car {
	int setNum;

	public int getSetNum() {
		return setNum;
	}

}

class Truck extends Car {
	int capacity;

	public int getCapacity() {
		return capacity;
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(80);
		sedan1.downSpeed(50);
		sedan1.setNum = 4;
		System.out.println("승용차의 현재 속도는 " + sedan1.speed + "km, 좌석수는 " + sedan1.getSetNum());
		
		Truck truck1 = new Truck();
		truck1.upSpeed(100);
		truck1.downSpeed(100);
		truck1.capacity = 50;
		System.out.println("트럭의 현재 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity());
	}

}
