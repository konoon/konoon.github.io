package coding_test04;

// while문을 사용해서 n까지 더한 합이 20이상이 되는 최초의 n값과
// n까지 더한 합을 다음의 실행 결과와 같이 표현하는 프로그램을 제작해 봅니다.
// 실행 결과
// 20이상이 되게 하는 최초의 n값 = 6
// n까지 더한 합 = 21

public class Coding_Test03 {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		while (true) {
			sum += n; // sum = sum + n;
			if(sum >= 20) {
				break;
			} else {
				n++;
			}
		}
		System.out.println("20이상이 되게 하는 최초의 n값 = " + n);
		System.out.println("n까지 더한 합 = " + sum);
	}
}