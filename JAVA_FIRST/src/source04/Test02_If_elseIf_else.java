package source04;

public class Test02_If_elseIf_else {

	public static void main(String[] args) {
		int score = 80;
		char grade = 'M';
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			grade = 'A';
			System.out.println("점수는 " + grade + "등급입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80~89점입니다.");
			grade = 'B';
			System.out.println("점수는 " + grade + "등급입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70~79점입니다.");
			grade = 'C';
			System.out.println("점수는 " + grade + "등급입니다.");
		} else {
			System.out.println("점수가 70점미만입니다.");
			grade = 'D';
			System.out.println("점수는 " + grade + "등급입니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
