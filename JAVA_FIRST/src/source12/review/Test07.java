package source12.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("첫번째 수를 입력해 주세요. ==>");
			int n1 = scan.nextInt();
			System.out.println("두번째 수를 입력해 주세요. ==>");
			int n2 = scan.nextInt();
			
			int n3 = n1 / n2;
			System.out.println("첫번째 수를 두번째 수로 나눈 값 = " + n3);
			return;
			// ArithmeticException : 0으로 나누기와 같은 부적절한 산술 연산을 수행할 때 발생
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("입력 값을 정수 숫자로 입력해 주시기 바랍니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
		
	}

}
