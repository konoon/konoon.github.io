package source11.review;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("★ Test01 클래스의 메인함수 실행");
		
		A a = new A();
		
		// 인스턴스 멤버 클래스
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 (정적으로 쓰면 인스턴스 안만들고 바로 가능)
		A.C c = new A.C();
		c.field1 = 5;
		c.method1();
		
		A.C.field2 = 7;
		A.C.method2();
		
		// 로컬 클래스 객체 호출
		a.method();
	}
}
