package source13;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
//		int num = 10;
		String num = "10";
		int value1 = Integer.parseInt(num);
		System.out.println("value1 : " + value1);
		
//		double dNum = 3.14;
		String dNum = "3.14";
		double value2 = Double.parseDouble(dNum);
		System.out.println("value2 : " + value2);
		
//		boolean bStr = true;
		String bStr = "true";
		boolean value3 = Boolean.parseBoolean(bStr);
		System.out.println("value3 : " + value3);
	}

}
