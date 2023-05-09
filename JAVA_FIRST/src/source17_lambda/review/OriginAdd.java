package source17_lambda.review;

public class OriginAdd {

	public static void main(String[] args) {

		int x = 3, y = 5;
		
		int sum = add(x, y);
		System.out.println(sum);
	}

	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
}
