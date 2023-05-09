/* 상속과 메소드 오버라이딩(method overriding)
1. 자바에서는 메소드 오버라이딩을 통해 상속받은 부모 클래스의 메소드를 자식 클래스에서 직접 재정의할 수 있습니다.
2. 앞서 배운 오버로딩(overloading)이란 서로 다른 시그니처를 갖는 여러 메소드를 하나의 이름으로 정의하는 것이었습니다.
3. 오버라이딩(overriding)이란 상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를
   자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의(재정의)하는 것이라고 할 수 있습니다.
4. 자바에서 자식 클래스는 부모 클래스의 private 멤버를 제외한 모든 메소드를 상속받습니다.
   이렇게 상속받은 메소드는 그대로 사용해도 되고, 필요한 동작을 위해 재정의하여 사용할 수도 있습니다.
5. 즉, 메소드 오버라이딩이란 상속받은 부모 클래스의 메소드를 재정의하여 사용하는 것을 의미합니다.

※ 오버라이딩의 조건 : 자바에서 메소드를 오버라이딩하기 위한 조건은 다음과 같습니다.
1. 오버라이딩이란 메소드의 동작만을 재정의하는 것이므로, 메소드의 선언부는 기존 메소드와 완전히 같아야 합니다.
    하지만 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있습니다.
2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경할 수 없습니다
3. 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다. */

package c_source;

class Parent1 {
	void display() {
		System.out.println("부모 클래스의 display()메서드 입니다. ");
	}
}

class Child1 extends Parent1 {

	@Override
	void display() {
		System.out.println("자식 클래스의 display()메서드 입니다. ");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Parent1 pa = new Parent1();
		pa.display();

		Child1 ch = new Child1();
		ch.display();

		Parent1 pc = new Child1();

		pc.display();
	}
}

/* 결과 화면
부모 클래스의 display()메서드 입니다. 
자식 클래스의 display()메서드 입니다. 
자식 클래스의 display()메서드 입니다. 
*/