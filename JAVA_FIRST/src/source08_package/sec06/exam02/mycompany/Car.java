package source08_package.sec06.exam02.mycompany;

import source08_package.sec06.exam02.hankook.SnowTire;
import source08_package.sec06.exam02.hyundai.Engine;
import source08_package.sec06.exam02.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	source08_package.sec06.exam02.hankook.Tire tire3 = new source08_package.sec06.exam02.hankook.Tire();
	source08_package.sec06.exam02.kumho.Tire tire4 = new source08_package.sec06.exam02.kumho.Tire();
}
