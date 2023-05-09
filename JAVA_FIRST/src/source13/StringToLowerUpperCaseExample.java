package source13;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		System.out.println(str1);
		
		String lowerCaseStr = str1.toLowerCase();
		System.out.println(lowerCaseStr);
		
		String upperCaseStr = str1.toUpperCase();
		System.out.println(upperCaseStr);
		
		// equals() 메서드는 문자열의 대소문자를 구분하여 비교함
		System.out.println(str1.equals(upperCaseStr));
		// equalsIgnoreCase() 메서드는 문자열의 대소문자를 구분하지 않고 비교함
		System.out.println(str1.equalsIgnoreCase(upperCaseStr));
		System.out.println(str1.equalsIgnoreCase(lowerCaseStr));
	}

}
