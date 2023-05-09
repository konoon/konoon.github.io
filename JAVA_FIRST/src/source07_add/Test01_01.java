package source07_add;

import java.util.Scanner;

public class Test01_01 {

	public static void main(String[] args) {
		// 여러개의 변수값을 선언하여 합계값을 출력하는 프로그램 제작

		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		int hap;
		
		System.out.println("첫번째 숫자를 입력해 주세요. ==> ");
		a = scan.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요. ==> ");
		b = scan.nextInt();
		System.out.println("세번째 숫자를 입력해 주세요. ==> ");
		c = scan.nextInt();
		System.out.println("네번째 숫자를 입력해 주세요. ==> ");
		d = scan.nextInt();
		
		hap = a + b + c + d;
		System.out.printf("합계값 = %d \n", hap);
		scan.close();
		
	}

}
