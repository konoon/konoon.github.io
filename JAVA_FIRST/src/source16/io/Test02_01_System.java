package source16.io;

public class Test02_01_System {

	public static void main(String[] args) {
		int a = 1234;
		float b = 100.12345f;
		char ch = 'K';
		String s = "JAVA";
		
		// 정수를 10진수, 16 진수, 8진수로 출력
		System.out.printf("정수의 10진수 => %d\n", a);
		System.out.printf("정수의 16진수 => %x\n", a);
		System.out.printf("정수의 8진수 => %o\n", a);
		
		// 실수를 일반 방식과 공학 방식으로 출력
		System.out.printf("실수 => %10.3f\n", b);
		System.out.printf("실수(공학용) => %e\n", b);
		
		// 문자와 문자열을 출력
		System.out.printf("문자 => %c\n", ch);
		System.out.printf("문자열 => %s\n", s);
	}

}
