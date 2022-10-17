package coding_test07;

public class Test01_01_Min {
//	static int min(int x, int y) {
//		return x < y ? x : y;
//	}
	public static void main(String[] args) {

		MyMin min = (int x, int y) -> {return x < y ? x : y;};  
		
		min.printDefault();

		MyMin.printStatic();		
		
		if(min.min(10, 5) == 5) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
	}
}

/* 실행 결과
Hello Interface Default Method!
Hello Interface Static Method!
정답입니다!
*/