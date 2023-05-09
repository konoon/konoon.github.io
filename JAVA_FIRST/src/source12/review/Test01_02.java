package source12.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01_02 {

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
		} catch (ArithmeticException e) {
			System.out.println("연산할 수 없는 값을 입력하셨습니다.");
			System.out.println("다시 입력해 주시기 바랍니다.");
			// InputMismatchException : 정수로 입력해야 하는데 문자로 입력할 경우 예외 발생
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해 주시기 바랍니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
		
	}

}
