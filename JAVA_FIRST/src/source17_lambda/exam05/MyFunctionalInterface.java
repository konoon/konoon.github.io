package source17_lambda.exam05;

// 로컬 변수의 사용
// 람다식은 함수적 인터페이스의 익명 구현 객체 생성
// 람다식에서 사용하는 외부 로컬 변수는 final 특성을 갖고 있음

@FunctionalInterface
public interface MyFunctionalInterface {

	public void method();
}
