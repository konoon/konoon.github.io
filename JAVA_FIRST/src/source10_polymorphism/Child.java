package source10_polymorphism;

public class Child extends Parent {
	// 메서드 재정의
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}
