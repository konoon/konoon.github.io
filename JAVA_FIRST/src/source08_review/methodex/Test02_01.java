package source08_review.methodex;

public class Test02_01 {

	public void print() {
		System.out.println("메소드를 호출합니다. = ☆");
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int result = 0;
		result = num1 + num2;
		
		System.out.println("메서드를 호출합니다. = ★" + " result 결과 값 " + result);
		
		Test02_01 method = new Test02_01();
		method.print();
	}

}
