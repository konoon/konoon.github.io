package source13.string_review;

// 문자열의 앞과 뒤의 공백을 제거한 후 문자열을 반환하는 trim()메서드

public class Test06 {
	public static void main(String[] args) {
		String str = " 한글 ABCD efgh";
		
		System.out.println("원본 문자열 ==> \n " + str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}

}
