package source12.review;

public class Test03_01 {

	public static void main(String[] args) {
		System.out.println("★ main()메서드 실행");
		Test03_01.method();
		System.out.println("method()수행을 마치고 main()메서드로 돌아옴");
	}

	public static void method() {
		try {
			System.out.println("method()호출");
			return;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("○ 중요 체크 method()의 finally블럭이 실행됨");
		}
	}

}
