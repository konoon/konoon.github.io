package source02;

public class Test04_VariableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);

	}

}
