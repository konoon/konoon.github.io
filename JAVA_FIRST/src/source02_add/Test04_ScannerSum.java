package source02_add;

import java.util.Scanner;

public class Test04_ScannerSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력해 주시기 바랍니다.");
		String str = scan.nextLine();
		
		System.out.println("입력하신 문자열은 " + str + "입니다");
		
		System.out.println("두번째 숫자를 입력해 주시기 바랍니다.");
		String str2 = scan.nextLine();
		
//		String numStr2 = str2;
		int numStr2 = Integer.parseInt(str2);
		System.out.println("두번째 입력하신 숫자는 " + numStr2 + " 입니다.");
		
		scan.close();
	}

}
