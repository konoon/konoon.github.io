package source13.string_review;

// 특정 문자열의 위치를 찾는  indexOf(), lastIndexOf()
public class Test04 {
	public static void main(String[] args) {
		String str = "Java를 공부하는 중, Java 화이링~ ^^!";
		
		System.out.println("문자열 ==> " + str);
		System.out.println("문자열의 위치 개수는 " + str.length() + "개 입니다!");
		
		System.out.print("제일 처음 나오는 자바위치 ==> ");
		System.out.println(str.indexOf("Java"));
		
		System.out.print("마지막에 나오는 자바위치 ==> ");
		System.out.println(str.lastIndexOf("Java"));
		
		String str1 = new String("Oracle Java");
		System.out.println("\n 원본 문자열 : " + str1);
		
		// 소문자 o가 검색되지 않는다면 -1값을 반환함
		System.out.println(str1.indexOf('o'));
		// 대문자 o가 검색된다면 0값을 반환함
		System.out.println(str1.indexOf('O'));
		System.out.println(str1.indexOf('k'));
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf("Java"));
		
		if(str1.indexOf('c') == -1) {
			System.out.println("찾으시는 문자는 입력 문자열에 포함되어 있지 않습니다.");
		} else {
			System.out.println("찾으시는 문자는 입력 문자열에 포함되어 있습니다.");
		}
		
	}
}
