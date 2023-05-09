package source08_review.methodex;

import java.util.Scanner;

public class Test07 {

	public static boolean charCheck(String phone, char ch) {
		boolean tf = false;
		
		for(int i = 0; i < phone.length(); i++) {
			if(phone.charAt(i) == ch) { // 010-1234-5678 체크
				tf = true;
				break;
			}
		}
		return tf;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("- 문자를 빼고 핸드폰 번호를 입력해 주시기 바랍니다. ==> ");
		// String 문자형 선언 phoneNum 변수값 입력 받음
		String phoneNum = scan.next();
		// if문으로 charCheck 사용자 메서드로 phoneNum 조건을 비교함
		if(charCheck(phoneNum, '-')) {
			System.out.println(phoneNum + "핸드폰 번호에 -이 포함되어 있습니다.");
			System.out.println("-은 제외하고 입력해 주시기 바랍니다.");
		} else {
			System.out.println(phoneNum + "이다.");
		}
		scan.close();
	}
}
