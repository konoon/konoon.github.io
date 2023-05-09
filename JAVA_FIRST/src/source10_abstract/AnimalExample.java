package source10_abstract;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("===========");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		// 자동 타입 변환 및 재정의된 메서드 호출
		animal = new Dog();
		animal.sound();
		// 자동 타입 변환 및 재정의된 메서드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("===========");
		
		// 메서드 다형성 활용
		animalSound(new Dog()); // Dog클래스의 Animal클래스 자동 타입 변환
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
