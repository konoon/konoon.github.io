package source03;

public class Test06_AssignmentOperator {

	public static void main(String[] args) {
		int result = 5;
		result += 10; // result = result + 10;
		System.out.println("결과값 result = " + result);
		
		result -= 3; // result = result - 3;
		System.out.println("결과값 result = " + result);
		
		result *= 2; // result = result * 2;
		System.out.println("결과값 result = " + result);
		
		result /= 4; // result = result / 4;
		System.out.println("결과값 result = " + result);
		
		result %= 5; // result = result % 5;
		System.out.println("결과값 result = " + result);
	}

}
