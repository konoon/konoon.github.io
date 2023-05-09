package source08_review.methodex;

// 메서드를 이용하지 않은 예시
public class Test01_01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합 (1부터 10까지) : " + sum);
		
		sum = 0;
		for(int i = 10; i <= 100; i++) {
			sum += i;
		}
		System.out.println("합 (10부터 100까지) : " + sum);
		
		sum = 0;
		for(int i = 100; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("합 (100부터 1000까지) : " + sum);
	}
}
