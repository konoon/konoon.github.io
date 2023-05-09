package source06;

public class Test02 {

	public static void main(String[] args) {
		// while문을 사용해서 1부터 10까지 합 구하는 프로그램 제작
		int hap = 0;
		int i;
		i = 1;
		while (i <= 10) {
			hap += i;
			i++;
			System.out.println(hap);
		}
		System.out.printf("1에서 10까지의 합 = %d \n", hap);
	}

}
