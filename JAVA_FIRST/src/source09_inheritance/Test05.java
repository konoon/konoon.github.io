package source09_inheritance;

class Parent4 {
	int a;
	
	public Parent4() {
		a = 10;
	}
	
	Parent4(int n) {
		a = n;
	}
}

class Child4 extends Parent4 {
	int b;
	
	public Child4() {
		super(40);
//		b = 20;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class Test05 {
	public static void main(String[] args) {
		Child4 ch = new Child4();
		ch.display();
	}

}
