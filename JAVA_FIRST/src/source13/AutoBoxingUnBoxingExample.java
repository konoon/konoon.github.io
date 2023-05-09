package source13;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 박싱
		int num = 100;
		Integer obj = num;
		System.out.println("value : " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("자동 박싱 처리된 " + value + "을 표현");
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result " + result);

	}

}
