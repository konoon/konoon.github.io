package source03;

import java.util.Scanner;

public class Test09_InputScanner {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력해 주시기 바랍니다 ==> ");
		String inputId = inputScanner.nextLine();
		
		System.out.println("패스워드를 입력해 주시기 바랍니다 ==> ");
		String inputPw = inputScanner.nextLine();
		
		int password = Integer.parseInt(inputPw);
		
		if(inputId.equals("jang")) {
			if(password == 1234) {
				System.out.println("로그인 성공 " + inputId + "님 반갑습니다.");
			} else {
				System.out.println("로그인 실패 : 패스워드가 유효하지 않습니다.");
			}
		} else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않습니다.");
		}

	}

}
