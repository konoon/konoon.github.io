package source12.review;

public class Test06 {
	
	public static void main(String[] args) {
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("main() 메서드에서 예외가 처리됨");
		}
	}

	public static void handlingException() throws Exception {
		throw new Exception();
	}

}
