package source10.exam02;

public class ElectricProductTest {
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.turnOn();
		fan.turnOff();
		fan.repair();
		
		System.out.println("========");
		
		Circulator ct = new Circulator();
		ct.turnOn();
		ct.turnOff();
		ct.repair();
		
		System.out.println("========");
		
		ElectricProduct.reset();
	}

}
