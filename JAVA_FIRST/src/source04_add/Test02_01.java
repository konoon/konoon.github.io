package source04_add;

import java.util.Scanner;

public class Test02_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수험생의 이름을 입력해 주시기 바랍니다. ==>");
		String name = scan.next();
		System.out.println("수험생" + name + "님의 영어 점수를 입력해 주세요. ==>");
		int eng = scan.nextInt();
		System.out.println("수험생" + name + "님의 면접 점수를 입력해 주세요. ==>");
		int itv = scan.nextInt();
		
		double avg = (eng + itv) / 2.00;
		if((eng >= 70) && (itv >= 70) && (avg >= 80.00)) {
			System.out.println("수험생" + name + "님은" + avg + "점으로 합격하셨습니다.");
		} else {
			System.out.println("수험생" + name + "님은" + avg + "점으로 불합격하셨습니다.");
		}
		scan.close();
	}

}
