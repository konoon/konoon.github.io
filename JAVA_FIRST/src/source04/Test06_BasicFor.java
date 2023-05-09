package source04;

public class Test06_BasicFor {

	public static void main(String[] args) {
		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		
		for(int i = 1; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("1~100까지의 합 = " + sum);

	}

}
