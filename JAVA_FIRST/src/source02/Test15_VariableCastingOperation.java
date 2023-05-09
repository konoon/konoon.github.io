package source02;

public class Test15_VariableCastingOperation {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		System.out.println((int)doubleValue);
		
		int result = intValue + (int)doubleValue;
		
		System.out.println(result);

	}

}
