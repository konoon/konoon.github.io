package source08_review;

class Method {
	int a = 10, b = 20; // 멤버 변수(인스턴스 변수)
	int multi() { // 멤버 메서드 (인스턴스 메서드)
		return a * b;
	}
	static int multi(int x, int y) { //정적 메서드 (클래스 메서드)
		return x * y;
	}
}

public class Test05 {
	public static void main(String[] args) {
		// 정적 static 메서스 호출
		System.out.println(Method.multi(20, 30));
		Method myMethod = new Method();
		System.out.println(myMethod.a); // 인스턴스 변수 a 호출
		System.out.println(myMethod.b); // 인스턴스 변수 b 호출
		System.out.println(myMethod.multi()); // 인스턴스 메서드 multi 호출
		
		// 정적 메서드 호출
		System.out.println(Method.multi(10, 15));

	}

}
