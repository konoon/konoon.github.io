package source13.java_api;

public class Test04_01_Unboxing {

	public static void main(String[] args) {
		int num = 10;
		
		// boxing 처리 : 기본형 타입을 객체형 타입으로 변환 하는 것
		Integer obj = new Integer(num);
		
		// unboxing 처리 : 객체 타입을 기본형 타입으로 변환 하는 것
		int sum = obj + 20;
		System.out.println(sum);
	}

}
