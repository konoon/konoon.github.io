package source12;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class CastCE_Exam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changDog(dog);
		
		Cat cat = new Cat();
		changDog(cat);
	}

	public static void changDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("강아지");
		}
	}
}
