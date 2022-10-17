package coding_test03;

// 1부터 20까지 수 중에서 다음의 실행 결과와 같이
// 3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
// 실행 결과 : 3 6 9 12 15 18

public class Coding_Test03{
	public static void main(String[] args) {
		int num;
		for (num = 1; num <= 20; num++) {
			if(num % 3 != 0) {
//			if(num % 3 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}