package source06;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// while문으로 무한 루프 만드는 프로그램
		Scanner s = new Scanner(System.in);
		int a, b;
		int i = 1;
		while (i <= 3) {
			System.out.println("입력해서 더할 첫 번째 숫자를 입력해 주세요. ==> ");
			a = s.nextInt();
			System.out.println("입력해서 더할 두 번째 숫자를 입력해 주세요. ==> ");
			b = s.nextInt();
			i++;
//			if(a == 0) {
//				break;
//			}
			
			System.out.printf("%d + %d = %d \n", a, b, a + b);
		}
//		System.out.println("0을 입력해서 반복문을 탈출했습니다.\n");
	}

}
