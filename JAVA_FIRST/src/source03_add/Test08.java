package source03_add;

public class Test08 {

	public static void main(String[] args) {
		
		int a = 10; // 1010
		int b = 7; // 0111
		int c = 10;
		int d = 7;

		int e = a&b;
		System.out.println("정수형 변수 e의 값 = " + e);
		int f = c|d;
		System.out.println("정수형 변수 f의 값 = " + f);
		int g = e^f; // ^(XOR) 연산 (배타적 논리형 연산)
		System.out.println("정수형 변수 g의 값 = " + g);
		int h = ~g;
		System.out.println("정수형 변수 h의 값 = " + h);
	}

}
