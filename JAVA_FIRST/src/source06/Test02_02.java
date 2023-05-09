package source06;

import java.util.Scanner;

public class Test02_02 {

	public static void main(String[] args) {
		// while문을 이용해서 보고싶은 구구단의 단을 입력하면, 해당하는 구구단이 출력되는 프로그램 제작
		int dan = 0, times = 1, total = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("보고싶은 구구단의 단을 입력해 주시기 바랍니다. ==> ");
		dan = scan.nextInt();
		
		while(times <= 9) {
			total = dan * times;
			System.out.println(dan + " X " + times + " = " + total);
			times++;
		}
		scan.close();
	}

}
