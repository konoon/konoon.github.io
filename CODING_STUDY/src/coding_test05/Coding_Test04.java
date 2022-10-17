package coding_test05;

import java.util.Scanner;

// 배열의 크기를 활용하여, 정수 5개를 입력하면
// 합계값과 평균값이 화면에 출력되는 자바 프로그램을 제작하고,
// 다음의 결과 내용과 같이 나타나도록 구현해 봅니다.
// 결과 내용
// 숫자를 입력해 주세요 ==> 10
// 숫자를 입력해 주세요 ==> 3
// 숫자를 입력해 주세요 ==> 2
// 숫자를 입력해 주세요 ==> 7
// 숫자를 입력해 주세요 ==> 8
// 입력된 5개 배열 요소값들의 합계값 = 30
// 입력된 5개 배열 요소값들의 평균값 = 6.0


public class Coding_Test04{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("숫자를 입력해 주세요 ==> ");
			scores[i] = in.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("입력된 5개 배열 요소값들의 합계값 = " + sum);
		System.out.printf("입력된 5개 배열 요소값들의 평균값 = %.1f", sum / (float)scores.length);
		in.close();
	}
}
