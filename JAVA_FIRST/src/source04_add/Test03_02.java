package source04_add;

import java.util.Scanner;

public class Test03_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("학생 이름을 입력해 주시기 바랍니다. ==> ");
		String name = in.next();
		
		System.out.println(name + "학생의 국어 점수를 입력해 주세요. ==>");
		int kor = in.nextInt();
		
		System.out.println(name + "학생의 영어 점수를 입력해 주세요. ==>");
		int eng = in.nextInt();
		
		double avg = (kor + eng) / 2.00;
		if((avg >= 90)) {
			System.out.println(name + "학생은 " + avg + "점으로  A학점입니다.");
		} else if ((avg >= 80)) {
			System.out.println(name + "학생은 " + avg + "점으로  B학점입니다.");
		} else if ((avg >= 70)) {
			System.out.println(name + "학생은 " + avg + "점으로  C학점입니다.");
		} else if ((avg >= 60)) {
			System.out.println(name + "학생은 " + avg + "점으로  D학점입니다.");
		} else if ((avg < 60)) {
			System.out.println(name + "학생은 " + avg + "점으로  F학점입니다.");
		}
		in.close();
	}

}
