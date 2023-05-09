package source07;

public class Test07_AdvancedFor {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30, 40, 50};
		
		int sum = 0;
		for (int good : scores) {
			sum = sum + good;
		}
		System.out.println("점수 총합 = " + sum);
	}

}
