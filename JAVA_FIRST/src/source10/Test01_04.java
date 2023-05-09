package source10;

interface Animal4 {
	void cry();
}

interface Cat4 extends Animal4 {
	@Override
	default void cry() {
	}
}

interface Dog4 extends Animal4 {
	@Override
	default void cry() {
	}
}

class MyPet implements Cat4, Dog4 {

	@Override
	public void cry() {
		System.out.println("멍냥");
	}
	
}

public class Test01_04 {
	public static void main(String[] args) {
		MyPet robotPet = new MyPet();
		robotPet.cry();
	}
}
