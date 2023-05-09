package source13.java_api.exam01;

public interface Controllable {
	
	default void repair() {
		System.out.println("장비를 수리합니다.");
	}
	static void reset() {
		System.out.println("장비를 초기화합니다.");
	}
	
	void turnOn();
	void turnOff();
}
