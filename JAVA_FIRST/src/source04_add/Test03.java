package source04_add;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade;
		System.out.println("점수를 입력해 주시기 바랍니다. ==> ");
		int score = scan.nextInt();
		
		if(score >= 90) {
			grade = "A";
		} else if (score >= 70) {
			grade = "B";
		} else if (score >= 60) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		scan.close();
	}

}
