package source02;

public class Test08_Char {

	public static void main(String[] args) {
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		char c4 = '가'; // 문자를 직접 저장
		char c5 = 44032; // 10진수로 저장
		char c6 = '\uac11'; // 16진수로 저장
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		

	}

}
