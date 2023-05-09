package source08_method;

public class CalcStatic {
	
	// 인스턴스 필드와 메소드
	int field1 = 3;
	void method1() {
		System.out.println("return 타입이 필요없는 void 형태 출력");
	}
	
	static double PI = 3.14159;
	
	static int plus(int x, int y ) {
		return x + y;
	}
	
	static int minus(int x, int y ) {
		return x - y;
	}
	
	static void method3() {
		int field2 = 10;
		
		CalcExcutor obj = new CalcExcutor();
		obj.avg(10, 20);
	}
}
