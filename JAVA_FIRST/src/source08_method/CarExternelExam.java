package source08_method;

public class CarExternelExam {

	public static void main(String[] args) {
		CarExternel yourCar = new CarExternel();
		yourCar.keyTurnOn();
		yourCar.run();
		int speed = yourCar.getSpeed();
		System.out.println("현재 속도 = " + speed + "km/h");
	}

}
