package source13.string_review;

import java.util.Scanner;

// 문자열의 포함을 확인하는 contains() 메서드 활용 예시

public class Test08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 포함 인증을 수행할 문자열을 입력해 주시기 바랍니다.");
		String inputStr = scan.nextLine();
		
		String str = inputStr;
		System.out.println("원본 문자열 ==> " + str);
		
		if(str.contains("Java")) {
			System.out.println("인증이 성공되었습니다.");
		} else {
			System.out.println("인증되지 않았습니다.");
		}
		
		scan.close();
//		System.out.println(str.contains("Java"));
//		System.out.println(str.contains("nice"));
	}

}
