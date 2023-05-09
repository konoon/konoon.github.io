package source10.exam02;

public class Circulator implements ElectricProduct {

	@Override
	public void turnOn() {
		System.out.println("서큘 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("서큘 끔");
	}

}
