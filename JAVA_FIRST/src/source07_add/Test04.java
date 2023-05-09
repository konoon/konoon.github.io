package source07_add;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 배열의 크기 : 정수 5개를 입력하면 평균값이 화면에 출력되는 프로그램 제작
		Scanner in = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("숫자를 입력해 주시기 바랍니다. ==> ");
			score[i] = in.nextInt();
		}
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("입력된 5개의 배열 요소값들의 한계값 " + sum);
		System.out.printf("입력된 5개 배열 요소값들의 평균값 = %.1f", (sum / (float)score.length));
		in.close();
	}

}
