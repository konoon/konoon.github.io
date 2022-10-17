package coding_test04;

import java.util.Scanner;

// while문을 이용해서 보고 싶은 구구단의 단을 입력하면,
// 다음의 결과 화면과 같이 해당하는 구구단이 출력되는 프로그램 제작해 봅니다.
/* 결과 화면
보고 싶은 구구단의 단을 입력해 주시기 바랍니다 ==> 7
7 X 1 = 7
7 X 2 = 14
7 X 3 = 21
7 X 4 = 28
7 X 5 = 35
7 X 6 = 42
7 X 7 = 49
7 X 8 = 56
7 X 9 = 63
*/

public class Coding_Test04 {
	public static void main(String[] args) {
		int dan = 0, times = 1, total = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("보고싶은 구구단의 단을 입력해 주시기 바랍니다. == >");
		dan = scan.nextInt();
		
		while (times <= 9) {
			total = dan * times;
			System.out.println(dan + " X " + times + " = " + total);
			times++;
		}
		scan.close();
	}
}