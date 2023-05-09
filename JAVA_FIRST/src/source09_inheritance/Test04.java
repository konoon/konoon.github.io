package source09_inheritance;

// 메서드 오버로딩 = 하나의 메서드 형식으로 여러 메서드 형식으로 변경하여 활용하는 것

class Parent2 {
	void display() {
		System.out.println("부모 클래스의 display() 메서드 입니다.");
	}
}

class Child2 extends Parent2 {
	void display() {
		System.out.println("자식 클래스의 display() 메서드 입니다.");
	}
	
	void display(String str) {
		System.out.println(str);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.display();
		ch.display("오버로딩 된 display() 메서드 입니다.");
	}
}
