package source04_add;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해 주시기 바랍니다. ==>");
		int number = in.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		in.close();
	}

}
