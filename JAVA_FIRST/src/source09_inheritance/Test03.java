package source09_inheritance;

class Parent1 {
	void display() {
		System.out.println("부모 클래스의  display() 메서드 입니다.");
	}
}

class Child1 extends Parent1 {

	@Override
	void display() {
		System.out.println("자식 클래스의  display() 메서드 입니다.");
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		Parent1 pa = new Parent1();
		pa.display();
		
		Child1 ch = new Child1();
		ch.display();
		
		Parent1 pc = new Child1();
		pc.display();
		
	}

}
