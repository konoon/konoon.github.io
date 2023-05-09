package source02;

public class Test05_VariableFunction {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		Test05_VariableFunction result = new Test05_VariableFunction();
		int c = result.sum(a, b);
//		System.out.println("결과값 = " + c);
	}

	int sum(int a, int b) {
		return a + b;
	}
}
