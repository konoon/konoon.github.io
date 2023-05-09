package source14.anonymous;

// 익명(이너) 클래스를 활용하여 인터페이스 객체 생성 예시

interface C {
	public abstract void bcd();
}

class A {
	C c = new C() {
		
		@Override
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

public class AnonymousClass {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}

}
