package source10;

class Animal3 {
	public void cry() {
		System.out.println("짓기");
	}
}

class Cat3 extends Animal3 {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}

class Dog3 extends Animal3 {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}

public class Test01_03 {
	public static void main(String[] args) {
		Cat3 c = new Cat3();
		c.cry();
	}
}
