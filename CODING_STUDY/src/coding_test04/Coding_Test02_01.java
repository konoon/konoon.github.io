package coding_test04;

// while문을 사용해서 1부터 10까지 숫자 중에서 3의 배수값들을 출력하고,
// 3의 배수값들의 합을 다음의 실행 결과와 같이 구하는 프로그램 제작해 봅니다.
// 실행 결과
// 3 6 9  
// 1부터 10까지 숫자 중에서 3의 배수값들의 합 = 18 

public class Coding_Test02_01 {
	public static void main(String[] args) {
		int a = 1, sum = 0;
		while (a <= 10) {
			if(a % 3 == 0) {
				System.out.print(a + " ");
				sum += a;
			}
			a++;
		}
		System.out.println(" ");
		System.out.println("1부터 10까지 숫자 중에서 3의 배수값들의 합 = " + sum);
	}
}