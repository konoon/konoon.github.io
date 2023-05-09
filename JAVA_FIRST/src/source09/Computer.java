package source09;

public class Computer extends Calculator{

	// Override 단축키 Alt + Shift + S, V
	
	// 메서드 오버라이딩(재정의)
	// @Override 어노테이션은 생략할 수도 있지만, 이것을 붙여주면 areCircle() 메서드가 정확히 재정의 된 것인지 컴파일러가 확인할 수 있기 때문에 @Override 어노테이션 활용함.
	
	@Override
	double areCircle(double r) {
		System.out.println("Computer의 객체의 areCircle() 실행");
		
		return Math.PI * r * r;
	}
	
}
