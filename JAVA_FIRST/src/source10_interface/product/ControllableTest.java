package source10_interface.product;

public class ControllableTest {

	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOn();
		tv.remoteOff();
		
		System.out.println("==============");
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		System.out.println("==============");
		
		controllable.reset();
		
	}

}
