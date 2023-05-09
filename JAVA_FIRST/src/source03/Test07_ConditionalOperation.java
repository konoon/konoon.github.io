package source03;

public class Test07_ConditionalOperation {

	public static void main(String[] args) {
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println("점수 등급 = " + grade + "입니다");
		
		
		/*
		 * if(score > 90) { grade = 'A'; } else { grade = 'B'; }
		 * System.out.println("점수 등급 = " + grade + "입니다");
		 */
	}

}
