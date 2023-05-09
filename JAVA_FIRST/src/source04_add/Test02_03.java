package source04_add;

import java.util.Scanner;

public class Test02_03 {

	public static void main(String[] args) {
		// 두 정수를 입력 받아서, 두 수중에서 큰 값을 구하는 프로그램 제작
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.println("두 번째 수를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("첫번째 입력값 " + num1 + "이 더 큽니다");
		} else {
			System.out.println("두번째 입력값 " + num2 + "이 더 큽니다");
		}
		scan.close();
	}

}
