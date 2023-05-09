package source08_review.methodex;

public class Test01_02 {
	public static void main(String[] args) {
		System.out.println("합 (1부터 10까지) : " + sum(1, 10));
		System.out.println("합 (10부터 100까지) : " + sum(10, 100));
		System.out.println("합 (100부터 1000까지) : " + sum(100, 1000));
	}

	public static int sum(int n1, int n2) {
		int sum = 0;
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}
}
