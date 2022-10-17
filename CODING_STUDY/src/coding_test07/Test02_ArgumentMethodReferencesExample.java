package coding_test07;

import java.util.function.ToIntBiFunction;

// 메서드 참조 정리
// 전달할 동작을 수행하는 메서드가 이미 정의된 경우에 표현할 수 있는 람다식의 축약형 표현임.
// 람다식에 아직 남아 있는 불필요한 정보까지 없애기 때문에 람다식에 비해 더욱 간결하고 가독성이 제고됨.

// 메서드 참조 예시
// 정적(static) 메서드 참조
// 클래스 :: 메서드

// 인스턴스 메서드 참조
// 참조변수 :: 메서드

public class Test02_ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		
		// Function 함수적 인터페이스 ToIntBiFunction<T, U>
		// 객체 T와 U를 int로 매핑해 주는 Function 함수적 인터페이스임.
		// 주로 매개값을 리턴값으로 매핑(타입 변환)할 경우 사용함.
		ToIntBiFunction<String, String> function;
		// compareToIgnoreCase() 는 대소문자를 무시하고 비교해 주는 함수입니다.
		// compareTo() 는 대소문자를 구분하여 비교해 주는 함수입니다.
		String str = "kbs";
		System.out.println(str.compareToIgnoreCase("KBS"));	// 0	
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("abcd", "abce")); // -1
		print(function.applyAsInt("abcd", "abce")); // 동일한 문자열이 아닙니다.
		
		System.out.println("\n=================================\n");
		
		function = String::compareToIgnoreCase;
		System.out.println(function.applyAsInt("abcd", "abcd")); // 0
		print(function.applyAsInt("abcd", "abcd")); // 동일한 문자열 입니다!
	}

	public static void print(int order) {
		if(order == 0) {
			System.out.println("동일한 문자열 입니다!");
		} else {
			System.out.println("동일한 문자열이 아닙니다!");
		}
	}
}

/* 실행 결과
0
-1
동일한 문자열이 아닙니다!

=================================

0
동일한 문자열 입니다!
*/
