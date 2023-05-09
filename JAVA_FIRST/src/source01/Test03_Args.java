package source01;

public class Test03_Args {

	public static void main(String[] args) {
		String arg1 = args[0];
		String arg2 = args[1];
		System.out.println("Arg is " + arg2);
		
		// 이클립스에서는 Test03_Args.java 파일 선택 후 우클릭
		// - Run As - Run Configurtions 클릭 
		// - Argments - Program arguments 탭 아래에 3 7 입력 후 Run 클릭
		// 결과 값 확인 Arg is 7
	}

}
