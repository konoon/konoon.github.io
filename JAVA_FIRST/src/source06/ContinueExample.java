package source06;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
			// 홀수값을 제외하고(건너뛰고) 보여줌
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i); // 홀수가 제외된 짝수만 보여줌
		}
	}

}
