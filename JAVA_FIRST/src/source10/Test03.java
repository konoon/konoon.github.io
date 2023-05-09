package source10;

interface Animal5 {
	void sound();
}

class Dog5 implements Animal5 {
	@Override
	public void sound() {
		System.out.println("멍");
	}
}

class Cuckoo implements Animal5 {
	@Override
	public void sound() {
		System.out.println("뻐꾹");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Dog5 d = new Dog5();
		d.sound();
		Cuckoo c = new Cuckoo();
		c.sound();
		
		System.out.println("=========");
		
		makeSound(d);
		makeSound(c);
	}

	static void makeSound(Animal5 a) {
		a.sound();
	}

}
