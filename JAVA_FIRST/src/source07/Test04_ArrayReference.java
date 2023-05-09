package source07;

public class Test04_ArrayReference {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		// .equals -> 문자열을 비교하는 메서드
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
