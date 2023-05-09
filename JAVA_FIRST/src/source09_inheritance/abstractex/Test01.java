package source09_inheritance.abstractex;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("나는 고양이다 야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("나는 강아지다 멍멍");
	}
}

public class Test01 {
	public static void main(String[] args) {
		// 추상클래스는 인스턴스를 생성할수없음
//		Animal ani = new Animal();
		
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
	}
}
