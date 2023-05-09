package source13.string_review;

import java.util.Scanner;

// 문자열의 처음 또는 끝이 특정 문자열인지 확인하는 startWith(), endWith(), 리턴값은 논리형의 true와 false

public class Test03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력해 주세요. ==> ");
		str = s.nextLine();
		
		System.out.print("출력 문자열  ==> ");
		if (!str.startsWith("(")) {
			System.out.print("(");
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i));
		}
		// 입력 문자열의 마지막이 )가 아니면 )를 넣어서 출력하게 함
		if (!str.endsWith(")")) {
			System.out.print(")");
		}
	}

}
