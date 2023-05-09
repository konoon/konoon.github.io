package source06;

public class Test01_02 {

	// while문을 사용해서 n까지 더한 합이 20이상이 되는 최초의 n값과 n까지 더한 합을 표현하는 프로그램 제작
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		// true로 넣는 이유는 계속 돌게 하기 위함
		while (true) {
			sum += n;
			
			if(sum >= 20) {
				break;
			}else {
				n++;
			}
		}
		System.out.println("20이상이 되게 하는 최초의 n값 = " + n);
		System.out.println("n까지 더한 값 = " + sum);
	}

}
