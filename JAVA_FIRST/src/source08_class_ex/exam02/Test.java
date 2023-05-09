package source08_class_ex.exam02;

class Car {
	private String color;
	private int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Test {
	public static void main(String[] args) {
		Car superCar = new Car();
		superCar.setColor("붉은색");
		superCar.setSpeed(200);
		
		System.out.println(superCar.getColor());
		System.out.println("최고 속도 = " + superCar.getSpeed());
	}
}
