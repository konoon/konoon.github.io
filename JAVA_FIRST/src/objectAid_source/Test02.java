// 인터페이스

package objectAid_source;

class Pet {
	void cute() {
		System.out.println("귀엽");
	}
}

interface Animal {
	void sound();
}

class Dog5 extends Pet implements Animal {
	
	
	@Override
	void cute() {
		System.out.println("사랑스런 강아지");
	}

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