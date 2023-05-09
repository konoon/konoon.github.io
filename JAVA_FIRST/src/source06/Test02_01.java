package source06;

public class Test02_01 {

	public static void main(String[] args) {
		// while문을 사용해서 1 부터 20까지 숫자 중에서 3의 배수값들을 출력하고, 3의 배수값들의 합을 구하는 프로그램 제작
		int a = 1, sum = 0;
		while(a <= 20) {
			if(a % 3 == 0) {
				System.out.println(a + "");
				sum += a; 
			}
			a++;
		}
		System.out.print("");
		System.out.printf("1부터 20까지 숫자 중에서 3의 배수값들의 합 = %d \n", sum);
	}

}
