package source08_review.methodex;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주시기 바랍니다. ==> ");
		int inputScore = scan.nextInt();
		
		printScore(inputScore);
		printScore(99);
		printScore(120);
		
		scan.close();
	}

	public static void printScore(int score) {
		if(score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score + "점 입니다.");
		}else {
			System.out.println("점수 : " + score + "점 입니다.");
		}
	}

}
