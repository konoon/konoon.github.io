package source10_interface.product;

// 전자 제품 제어 활용을 위한 인터페이스 생성
public interface controllable {
	void turnOn();
	
	void turnOff();
	
	// default, static를 붙이면 추상메서드 사용안해도됨
	default void repair() {
		System.out.println("전자제품 장비를 수리합니다.");
	}
	
	static void reset() {
		System.out.println("초기화합니다.");
	}
}
