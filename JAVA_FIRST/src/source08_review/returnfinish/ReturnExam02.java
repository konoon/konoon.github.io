package source08_review.returnfinish;

class Method {
	int a = 10;
	int b = 20;
	int add() {
		return a + b;
	}
	
	static int c = 70; // static(정적) 변수인 정수형 c에 70을 대입함
	static int add(int x, int y) {
		return x + y;
	}
}

public class ReturnExam02 {
	public static void main(String[] args) {
		System.out.println(Method.add(20, 30)); // add() 클래스 메서드 호출
		System.out.println(Method.c);
		
		Method myMethod = new Method();
		System.out.println(myMethod.add());
	}

}
