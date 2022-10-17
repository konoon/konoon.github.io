package coding_test03;

// for문을 활용하여, 다음 실행 결과와 같이
// 1부터 5까지 합을 구하는
// 자바 프로그램을 제작해 봅니다.
// 실행 결과 : 1부터 5까지의 합 = 15

public class Coding_Test01_01 {
	public static void main(String[] args) {
		// 합계값을 누적할 변수 hap을 선언하고 0으로 초기화 합니다.
		int hap = 0;
		int i;
		for (i = 1; i < 5; i++) {
			hap += i; // hap = hap + i;
		}
		System.out.println("1부터 5까지의 합 " + hap);
	}
}