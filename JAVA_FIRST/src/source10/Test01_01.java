package source10;

interface Animal {
	void cry();
}

class Cat implements Animal {

	@Override
	public void cry() {
		System.out.println("소리를 지른다 애옹쓰");
	}
	
}

class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("소리를 지른다 멍");
	}
	
}

public class Test01_01 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.cry();
		
		Dog d = new Dog();
		d.cry();
	}

}
