package source10.exam02;

public interface ElectricProduct {
	void turnOn();
	void turnOff();
	
	default void repair() {
		System.out.println("전자제품 수리");
	}
	
	static void reset() {
		System.out.println("전자제품 초기화");
	}
}
