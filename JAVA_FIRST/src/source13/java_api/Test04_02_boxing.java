package source13.java_api;

public class Test04_02_boxing {
	public static void main(String[] args) {
		double num = 123.45;
		printDouble(new Double(num));
	}

	public static void printDouble(Double obj) {
		System.out.println(obj);
	}

}
