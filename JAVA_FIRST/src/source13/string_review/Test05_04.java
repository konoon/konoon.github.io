package source13.string_review;

import java.util.Scanner;

public class Test05_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해 주시기 바랍니다. ==> ");
		String inputStr = scan.nextLine();
		System.out.println("입력 문자열에서 찾고 싶은 문자열을 입력해 주시기 바랍니다. ==> ");
		String inputFindStr = scan.next();
		
		String str = inputStr;
		String find_ch = inputFindStr;
		int find = str.indexOf(find_ch);
		
		System.out.println(find);
		System.out.println(find_ch.length());
		
		String res = str.substring(find, find + find_ch.length());
		System.out.println(res);
		
		scan.close();
	}

}
