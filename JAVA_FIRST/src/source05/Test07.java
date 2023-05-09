package source05;

import java.util.Scanner;

public class Test07 {
	// 단을 입력 받아서 for문 활용 구구단을 화면으로 출력하는 프로그램 제작
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times;
		int dan; // 화면으로 보여줄 단값을 입력 받을 변수 dan 선언
		
		System.out.print("보고싶은 구구단의 단을 입력해 주세요. ==> ");
		dan = scan.nextInt(); // 구구단으로 보여줄 단값을 입력 받음
		
		for(times = 1; times <= 9; times++) {
			System.out.printf("%d X %d = %2d \n", dan, times, dan * times);
		}
		scan.close();
	}

}
