package source08_package.sec06.exam03.package1;

// default 기본 접근 제한자(public을 지움) -> 같은 패키지에서는 쓸수있지만 다른 패키지에서는 사용 X
public class Ace {
	// public 접근 제한 생성자
	public Ace(boolean b) {
	}
	
	// default 접근 제한 생성자
	Ace(int b) {
	}
	
	// private 접근 제한 생성자
	private Ace(String s) {
		
	}
	
	// 필드
	Ace a1 = new Ace(true); // public 접근 제한 생성자
	Ace a2 = new Ace(5); // default 접근 제한 생성자
	Ace a3 = new Ace("문자열"); // private 접근 제한 생성자
	
}
