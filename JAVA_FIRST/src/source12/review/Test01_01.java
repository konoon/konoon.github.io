package source12.review;

import java.util.Scanner;

public class Test01_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째수를 입력해 주세요. ==>");
			int n1 = scan.nextInt();
			System.out.println("두번째수를 입력해 주세요. ==>");
			int n2 = scan.nextInt();
			try {
				int n3 = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + n3);
				
			} catch (Exception e) {
				System.out.println("0으로 나눌 수는 없습니다.");
				System.out.println("오류 메시지 = " + e.getLocalizedMessage());
				continue;
			}
			System.out.println("계속 할까요? yes 또는 no 입력");
			String ans = scan.next();
			if(ans.equals("no") || ans.equals("NO")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
//			scan.close();
		}
	}

}
