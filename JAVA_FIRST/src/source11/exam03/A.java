package source11.exam03;

// 멤버 클래스에서 사용 제한
public class A {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
	}
	
	class B {
		void method() {
			// 모든 필드와 메서드에서 접근할 수 있음
			field1 = 10;
			method1();
			field2 = 10;
			method2();
		}
	}
	static class C {
		void method() {
			// 인스턴스 필드와 메서드는 접근할 수 없음
			field2 = 10;
			method2();
		}
	}
}
