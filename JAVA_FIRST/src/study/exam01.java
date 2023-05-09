package study;

import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A + B);
	}
}
