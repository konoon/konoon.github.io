package coding_test02;

// operator 값이 +, -, *, / 인 경우에
// 사칙 연산을 수행하는 프로그램을 switch case문을
// 사용해서 구현해 보시기 바랍니다.
// int num1 = 10;
// int num2 = 2;
// char operator = '+';

public class Coding_Test01_02{
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
			break;
		}
		System.out.println("결과 값은 " + result + "입니다.");
	}
}