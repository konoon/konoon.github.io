package source08_method;

public class SingleTon {
	private static SingleTon singleton = new SingleTon();
	
	private SingleTon() {
		
	}
	
	static SingleTon getInstace() {
		return singleton;
		
	}
}
