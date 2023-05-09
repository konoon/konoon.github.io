package source07_add;

import java.util.Scanner;

public class Test01_02 {

	public static void main(String[] args) {
		// 배열을 활용하여 여러개의 변수값을 선언하여 합계값을 출력하는 프로그램 제작

		Scanner scan = new Scanner(System.in);
		// 정수형 배열명 aa에 배열 요소 4개 메모리 공간을 생성하여 대입함
		int [] aa = new int[4] ;
		int hap = 0;
		
		System.out.println("첫번째 숫자를 입력해 주세요. ==> ");
		aa[0] = scan.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요. ==> ");
		aa[1] = scan.nextInt();
		System.out.println("세번째 숫자를 입력해 주세요. ==> ");
		aa[2] = scan.nextInt();
		System.out.println("네번째 숫자를 입력해 주세요. ==> ");
		aa[3] = scan.nextInt();
		
//		hap = aa[0] + aa[1] + aa[2] + aa[3];
		for(int i = 0; i < aa.length; i++) {
			hap += aa[i];
		}
		System.out.printf("합계값 = %d \n", hap);
		scan.close();
		
	}

}
