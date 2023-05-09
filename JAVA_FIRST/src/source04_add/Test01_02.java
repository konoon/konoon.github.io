package source04_add;

import java.util.Scanner;

public class Test01_02 {

	// if문 활용 임의의 세 수를 입력 받아서 가장 큰 수를 출력하는 프로그램 제작
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해 주시기 바랍니다. ==> ");
		int a = scan.nextInt();
		System.out.println("두번째 수를 입력해 주시기 바랍니다. ==> ");
		int b = scan.nextInt();
		System.out.println("세번째 수를 입력해 주시기 바랍니다. ==> ");
		int c = scan.nextInt();
		
		if((a>b)&&(a>c)) {
			System.out.println("세 개의 수 " + a + ", " + b + ", " + c + "중 가장 큰 값은" + a + "입니다.");
		}
		if((b>a)&&(b>c)) {
			System.out.println("세 개의 수 " + a + ", " + b + ", " + c + "중 가장 큰 값은" + b + "입니다.");
		}
		if((c>b)&&(c>a)) {
			System.out.println("세 개의 수 " + a + ", " + b + ", " + c + "중 가장 큰 값은" + c + "입니다.");
		}
		scan.close();
	}

}
