package source04_add;

public class Test08 {

	public static void main(String[] args) {
		
		// return문을 사용해서 hap이 500을 초과할 경우, 현재 메서드를 호출한 곳으로 복귀하게 처리
		
		int hap = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			hap += i;
//			System.out.println(i);
//			System.out.println(hap);
		System.out.printf("1부터 100까지의 합은 %d입니다.\n", hap);
		
			if(hap > 500) {
				System.out.println("프로그램의 끝입니다");
				return; // 현재 메서드를 호출한 곳으로 복귀하게 처리
			}
		}
	}

}
