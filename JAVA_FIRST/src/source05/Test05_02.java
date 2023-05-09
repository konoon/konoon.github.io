package source05;

public class Test05_02 {
	// 1부터 100까지 숫자 중에서 3의 배수값을 출력하고 3의 배수합도 출력하는 프로그램 제작
	public static void main(String[] args) {
		// 정수형 3의 배수합 변수 thbh를  0으로 초기값 세팅
		int i, thbh = 0;
		
		for(i = 1; i <= 100; i++) {
			// i % 3 == 0 -> 3의 배수를 의미함
			if(i % 3 == 0) {
				System.out.println(i + "");
				thbh += i;
			}
		}
		System.out.println("3의 배수 합계 = " + thbh);
	}

}
