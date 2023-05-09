package source04_add;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 두수를 입력 받아 while 문을 활용하여 두수의 합을 구하는 프로그램 제작
		// break문을 사용해서 a의 입력값이 0일 경우 while 반복문을 탈출하게 함
		
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while (true) { // while (true)는 무한루프 시작 처리
			System.out.print("덧셈을 할 첫번째 수를 입력해 주세요. ==> ");
			a = s.nextInt();
			System.out.print("덧셈을 할 두번째 수를 입력해 주세요. ==> ");
			b = s.nextInt();
			
			if (a==0) {
				break;
			}
			
			System.out.printf("%d + %d = %d \n", a, b, a + b);
		}
		System.out.println("0을 입력해서 반복문을 탈출했습니다. \n");
	}

}
