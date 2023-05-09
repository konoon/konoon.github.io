package source02;

public class Test11_numberChange {

	public static void main(String[] args) {
		// 자바에서 제공하는 진법 변환 메서드 활용
		// 10진수를 2진수, 8진수, 16진수로 변환하는 예시
		int data = 10; // 10진수 정수 10 초깃값 할당
		System.out.println(Integer.toBinaryString(data)); // 1010
		System.out.println(Integer.toOctalString(data)); // 12
		System.out.println(Integer.toHexString(data)); // a

		// 2진수, 8진수, 16진수를 10진수로 변환하는 예시
		System.out.println(Integer.parseInt("1010", 2)); // 10
		System.out.println(Integer.parseInt("12", 8)); // 10
		System.out.println(Integer.parseInt("a", 16)); // 10
	}

}
