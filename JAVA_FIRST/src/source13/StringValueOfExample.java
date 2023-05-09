package source13;

public class StringValueOfExample {

	public static void main(String[] args) {
		int num = 10;
//		String str = num;
		
		String str = String.valueOf(num);
		System.out.println("문자열로 변환된 " + str + "입니다.");
		
		double numDouble = 10.5;
		String strNum = String.valueOf(numDouble);
		System.out.println("double형을 String 문자열로 변환한 " + strNum + "입니다.");
		
		boolean tf = true;
		String strBoolean = String.valueOf(tf);
		System.out.println("boolean형을 String 문자열로 처리한 " + strBoolean + "입니다.");
	}

}

