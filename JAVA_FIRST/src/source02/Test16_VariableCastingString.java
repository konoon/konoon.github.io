package source02;

public class Test16_VariableCastingString {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		String str1 = String.valueOf(10);
		System.out.println(str1);
		
		String str2 = String.valueOf(3.14);
		System.out.println(str2);
		
		String str3 = String.valueOf(true);
		System.out.println(str3);
		
		String value = "3" + "7";
		System.out.println(value);
		
		
	}

}
