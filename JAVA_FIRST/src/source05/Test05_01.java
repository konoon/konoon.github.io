package source05;

import java.util.Scanner;

public class Test05_01 {
	// for문을 사용해서 합계 구하는 프로그램 제작
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 합계를 누적할 정수형 변수 hap을 선언하고 0으로 초기화(초기값 셋팅)함
		int hap = 0;
		int i; // 1씩 증가할 변수를 선언함
		int num; // 입력 받을 최종 값을 선언함
		
		System.out.println("합계값을 구하고 싶은 정수값을 입력해 주세요 ==> ");
		num = s.nextInt(); // 최종 값을 입력함

		// i의 초기값 1부터 "입력 받은 최종값"까지 1씩 증가시키며 반복함
		for(i = 1; i <= num; i++) {
			hap += i;
			//System.out.println(hap);
		}
		System.out.printf("1에서 %d까지의 합 = %d \n", num, hap);
		s.close();
	}

}
