package source12;

public class Exception_throw_Exam {

	public static void main(String[] args) {
		try {
			throw new Exception(); // throw는 예외 강제 처리, throws는 예외 미루어 처리
		} catch (Exception e) {
			System.out.println("예외를 강제로 발생했습니다.");
		}
	}

}
