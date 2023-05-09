package source08_review.methodex;

import java.util.Scanner;

// 메서드의 매개변수 활용

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("화면에 출력하고 싶은 문자열을 입력해 주세요. ==> ");
		String inputStr = scan.nextLine();
		System.out.println("화면에 반복 출력하고 싶은 횟수를 입력해 주세요. ==> ");
		int inputNum = scan.nextInt();
		
		echo(inputStr, inputNum);
		scan.close();
	}

	// echo() 메서드의 매개변수는 String str, int num
	public static void echo(String str, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}

}
