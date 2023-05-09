package source06;

import java.util.Scanner;

public class Test04_02 {

//	do ~ while 문을 이용해서 보고싶은 구구단의 단을 입력하면, 해당하는 구구단이 출력되는 프로그램 제작
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		do {
			System.out.println("알고 싶은 구구단의 단 값을 입력해 주세요. ==> ");
			dan = scan.nextInt();
		} while(dan > 9 || dan < 2);
		System.out.println("[" + dan + "단]");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		scan.close();
	}

}
