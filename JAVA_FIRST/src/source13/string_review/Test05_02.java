package source13.string_review;

// 문자열의 각 문자를 charAt() 메서드를 이용해서 하나씩 출력하는 예시

public class Test05_02 {
	public static void main(String[] args) {
		String str = new String("Java");
		
		System.out.println("원본 문자열 = " + str);
		System.out.println(str.charAt(2));
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

}
