package source09_inheritance;

class Parent3 {
	int a = 10;
}

class Child3 extends Parent3 {
	void display() {
		System.out.println(a); // 변수 a값
		System.out.println(this.a); // this.a 값
		System.out.println(super.a);
	}
}

public class Test06 {
	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.display();
	}

}
