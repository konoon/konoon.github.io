package source08_method;

public class Calculator {

	// 메서드 선언
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int subtract(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int mutiplication(int x, int y) {
		int result = x * y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
