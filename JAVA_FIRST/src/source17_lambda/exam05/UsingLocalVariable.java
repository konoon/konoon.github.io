package source17_lambda.exam05;

// 로컬 변수의 사용
// 람다식은 함수적 인터페이스의 익명 구현 객체 생성

public class UsingLocalVariable {

	void method(int arg) { // arg는 final 특성을 가짐
		int localVar = 40;  // localVar는 final 특성을 가짐
		// 람다식 활용
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 사용
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
