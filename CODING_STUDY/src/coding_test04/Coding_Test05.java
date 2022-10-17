package coding_test04;

import java.util.Scanner;

// while문과 Math.random() 메서드를 이용해서
// 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
// 눈의 합이 5가 아니면 계속 주사위를 던지고,
// 눈의 합이 5이면 실행을 멈추는 자바 프로그램을 제작합니다.
// 참고로, 눈의 합이 5가 되는 조합은 (1,4), (4, 1),
// (2, 3), (3, 2) 입니다.

public class Coding_Test05 {
	public static void main(String[] args) {
		while (true) {
			int num1 = (int)(Math.random() * 6) + 1; 
			int num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if((num1 + num2) == 5) {
				break;
			}
		}
	}
}