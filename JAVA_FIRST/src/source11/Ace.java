package source11;

import javax.tools.Diagnostic;

class Ace {
	public Ace() {
		System.out.println("Ace 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class Base{
		public Base() {
			System.out.println("Base 객체가 생성됨");
		}
		int field1;
//		static int field2;
		
		void method1() {
		}
//		static void method2() {
//		}
	}
	// 정적 멤버 클래스는 static이 붙은거
	static class Case {
		public Case() {
			System.out.println("Case 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
		}
		static void method2() {
		}
	}
	
	void method() {
		// 로컬 클래스
		class Drive {
			public Drive() {
				System.out.println("Drive 객체가 생성됨");
			}
			// static타입 사용X
			int field1;
			void method1() {
			}
		}
		Drive drive = new Drive();
		drive.field1 = 3;
		drive.method1();
	}
	
}

