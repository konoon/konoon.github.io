package source04_add;

import java.util.Scanner;

public class Test02_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해 주시기 바랍니다. ==> ");
		String id = scan.next();
		System.out.println("비밀번호를 입력해 주시기 바랍니다. ==> ");
		String pwd = scan.next();
		
		if(id.equals("song") && pwd.equals("1234")) {
			System.out.println(id + "님 환영합니다.");
		} else {
			System.out.println("아이디 혹은 비밀번호가 정확하지 않습니다.");
		}
		scan.close();
	}

}
