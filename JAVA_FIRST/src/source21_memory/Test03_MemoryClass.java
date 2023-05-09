package source21_memory;

// 메서드 오버로 vs 메서드 오버라이딩
// 메서드 오버로딩은 여러가지 새로운 메서드형으로 정의해서 활용이 가능
// 메서드 오버라이딩은 상속 받은 기존의 메서드를 재정의해서 활용가능

class Parent {
	void display() {
		System.out.println("부모 클래스의 display() 메서드");
	}
}

class Child extends Parent {

	@Override
	void display() {
		System.out.println("자식 클래스의 display() 메서드");
	}
	
	void display(String str) {
		System.out.println(str);
	}
}

public class Test03_MemoryClass {
	public static void main(String[] args) {
		
		Child ch = new Child();
		// 메서드 오버라이딩된 display() 메서드의 메시지가 화면에 출력됨
		ch.display();
		ch.display("오버로딩 된 display() 메서드의 매개변수 str에 문자열 입력");
	}
}
