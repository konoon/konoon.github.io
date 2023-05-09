package source11.review;

public class A {
	// 외부 클래스 A정의
	public A() {
		System.out.println("＠  A객체가 생성됨");
	}
	
	// 외부클래스 A의 내부 인스턴스 멤버 클래스 B정의
	public class B {
		public B() {
			System.out.println("& B객체가 생성됨");
		}
		int field1;
		
		void method1() {
			System.out.println("method1() 메서드 실행 " + "field1값 : " + field1);
		}
	}
	
	// 정적 static 멤버 클래스
	static class C {
		public C() {
			System.out.println("● C객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("☆ static Class C method1() 메서드 실행 " + "field1값 : " + field1);
		}
		
		static void method2() {
			System.out.println("§ static Class C method2() 메서드 실행 " + "field2값 : " + field2);
		}
	}
	
	// 로컬 클래스 D정의
	void method() {
		class D {
			public D() {
				System.out.println("◆  D객체가 생성됨");
			}
			
			void method1() {
				System.out.println("▲ 로컬 클래스 D의 method1()실행");
			}
		}
		D d = new D();
		d.method1();
	}
}
