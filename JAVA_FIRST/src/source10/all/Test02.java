package source10.all;

class Car1 {
	public Car1() {
		System.out.println("슈퍼 클래스 생성자 실행**");
	}
}

class Sedan1 extends Car1 {
	public Sedan1() { // 서브 클래스 생성자
		System.out.println("서브 클래스 생성자 호풀**");
	}
}

public class Test02 {
	public static void main(String[] args) {
		Sedan1 sedan = new Sedan1();
	}
}
