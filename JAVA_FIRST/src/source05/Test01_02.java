package source05;

public class Test01_02 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		
		for (i = 1; i <= 10; i++) {
			hap += i; // hap 변수에 1부터 10까지 반복해서 누적한다. hap= hap+i와 동일합니다.
			// hap = hap + i = 0 + 1 = 1
			// hap = hap + i + 1 = 2 + 1 = 3
			// hap = hap + i + 1 + 1 = 3 + 3 = 6
			// hap = hap + i + 1 + 1 + 1 = 4 + 6 = 10
			// hap = hap + i + 1 + 1 + 1 + 1 = 5 + 10 = 15
			// hap = hap + i + 1 + 1 + 1 + 1 + 1 = 6 + 15 = 21
			// hap = hap + i + 1 + 1 + 1 + 1 + 1 + 1 = 7 + 21 = 28
			// hap = hap + i + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8 + 28 = 36
			// hap = hap + i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 9 + 36 = 45
			// hap = hap + i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 10 + 45 = 55
		}
		System.out.printf("1에서 10까지의 합 : %d \n", hap);
	}

}
