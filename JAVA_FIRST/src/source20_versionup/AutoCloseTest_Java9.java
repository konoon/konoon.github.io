package source20_versionup;

public class AutoCloseTest_Java9 {
	public static void main(String[] args) {
	
		AutoCloseObj obj = new AutoCloseObj();
		// obj: 자바 9버전 부터는 외부에서 선언한 변수를 그대로 쓸 수 있게 되었은.
		
		try(obj) {
			throw new Exception(); // 강제 예외
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
