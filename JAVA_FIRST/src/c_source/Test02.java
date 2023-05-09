// 인터페이스

package c_source;

interface Animal {
	void sound();
}

class Dog5 implements Animal {
	public void sound() {
		System.out.println("멍멍~~");
	}
}

class Cuckoo implements Animal {
	public void sound() {
		System.out.println("뻐꾹~~");
	}
}

public class Test02 {
	public static void main(String[] args) {
		Dog5 d = new Dog5();
		d.sound();
		Cuckoo c = new Cuckoo();
		c.sound();

		makeSound(d);
		makeSound(c);
	}
	static void makeSound(Animal a) {
		a.sound();
	}
}