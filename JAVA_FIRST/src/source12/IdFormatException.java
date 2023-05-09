package source12;

// 사용자 정의 예외 클래스 생성
public class IdFormatException extends Exception {
	
	// 생성자의 매개변수로 예외 상황 메서지를 받음
	public IdFormatException(String message) {
		super(message); // 예외 메서지 설정
	}
}
