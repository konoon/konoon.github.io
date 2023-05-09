package source10;

interface Animal1 {
	void cry();
}

interface Pet {
	void play();
}

class Cat1 implements Animal1, Pet {
	
	@Override
	public void play() {
		System.out.println("쥐잡기 놀이");
	}

	@Override
	public void cry() {
		System.out.println("소리를 지른다 냥");
	}
	
}

class Dog1 implements Animal1, Pet {
	
	@Override
	public void play() {
		System.out.println("산책ㄱ");
	}

	@Override
	public void cry() {
		System.out.println("소리를 지른다 멍");
	}
	
}

public class Test01_02 {

	public static void main(String[] args) {
		Cat1 c = new Cat1();
		c.play();
		c.cry();
		
		System.out.println("=========");
		Dog1 d = new Dog1();
		d.play();
		d.cry();
	}

}
