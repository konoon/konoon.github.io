package source10.all;

class Car2 {
	public Car2() {
		System.out.println("슈퍼 클래스 생성자 호출(파라미터 변수 없음)");
	}
}

class Sedan2 extends Car2 {
	public Sedan2(String str) {
		System.out.println("서브 클래스 생성자 호출 ==> " + str);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Sedan2 sedan = new Sedan2("Sonata");
	}
}
