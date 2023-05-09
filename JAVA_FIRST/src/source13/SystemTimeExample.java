package source13;

public class SystemTimeExample {

	// 프로그램 실행 소요 시간 구하기 : 프로그램 시작 시간을 읽고, 프로그램이 끝날 때 시간을 읽어서 차이를 구하면 프로그램 실행 소요시간이 나옴
	public static void main(String[] args) {
		long time1 = System.nanoTime(); // 시작 시간 읽기
		
		int sum = 0;
		// for문을 사용해서 1부터 1000000까지 합을 구하는데 걸린 시간을 출력
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime(); // 끝 시간 읽기
		System.out.println("1~1000000 까지 합 : " + sum);
		System.out.println("합 계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
	}

}
