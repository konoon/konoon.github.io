package source10_interface.product;

public class Computer implements controllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다");
	}

}
