package source13.java_api;

import source13.java_api.exam01.Computer;
import source13.java_api.exam01.Controllable;
import source13.java_api.exam01.TV;

public class Test01_02 {

	public static void main(String[] args) {
		Controllable[] controllable = {new TV(), new Computer()};
		
		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
	}

}
