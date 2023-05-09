package source12.review;

import java.util.InputMismatchException;
import java.util.Scanner;

// 배열 첨자가 잘못되면 예외가 발생, 이에 대한 적절한 예외처리를 해주는 프로그램 코딩

public class Test02 {

	public static void main(String[] args) {
		String [] str = {"김희선", "장나라", "이영자", "이영애", "전지현"};
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("몇 번 학생의 이름을 출력할까요? (종료 = 0)");
		try {
			int n = scan.nextInt();
			if(n == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			String s = str[n - 1];
			System.out.println(n + "번 학생의 이름은 " + s + "입니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1번부터 5번까지 학생 번호만 입력할 수 있습니다.");
//			System.out.println("오류 메시지 = " + e.getMessage());
			continue;
			} catch (InputMismatchException e) {
				System.out.println("메시지를 숫자로 입력해 주세요.");
				scan.next();
//				continue;
			}
		}
	}

}
