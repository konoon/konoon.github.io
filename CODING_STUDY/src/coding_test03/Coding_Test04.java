package coding_test03;

// 1부터 더했을 때, 다음 실행 결과와 같이
// 그 합이 500이 넘었을 때의
// 자연수 값은 얼마인지를 알아내는
// 자바 프로그램을 제작해 봅니다.
// 실행 결과
// num : 32
// sum : 528

public class Coding_Test04{
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (num = 1; ; num++) {
			sum += num;
			if(sum >= 500) {
				break;
			}
		}
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}
}s