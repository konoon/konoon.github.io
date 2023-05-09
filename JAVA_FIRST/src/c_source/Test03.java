// 추상클래스와 추상 메소드

/* 추상 메소드의 사용 목적
자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시
추상 메소드를 구현하도록 하기 위함입니다. 만약 일반 메소드로 구현한다면 사용자에 따라 해당 메소드를 구현할 수도 있고,
안 할 수도 있습니다. 하지만 추상 메소드가 포함된 추상 클래스를 상속받은 모든 자식 클래스는 추상 메소드를 구현해야만
인스턴스를 생성할 수 있으므로, 반드시 구현하게 됩니다. */

package c_source;

abstract class Animal1 {  // 추상 클래스(abstract class) 인 Animal 클래스는 추상 메소드인 cry() 메소드를 가지고 있습니다.
	abstract void cry();
}

/* Animal 클래스를 상속받는 자식 클래스인 Dog 클래스와 Cat 클래스는 cry() 메소드를 오버라이딩해야만
 
  비로소 인스턴스를 생성할 수 있습니다. */

class Cat1 extends Animal1 {
	void cry() {
		System.out.println("냐옹냐옹!");
	}
}

class Dog1 extends Animal1 {
	void cry() {
		System.out.println("멍멍!");
	}
}

public class Test03 {

	public static void main(String[] args) {

		// Animal1 a = new Animal1(); // 추상 클래스는 인스턴스를 생성할 수 없음.

		Cat1 c = new Cat1();

		Dog1 d = new Dog1();

		c.cry();

		d.cry();
	}
}
/* 결과 화면
냐옹냐옹!
멍멍! */