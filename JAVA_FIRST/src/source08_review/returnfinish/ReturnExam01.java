package source08_review.returnfinish;

// return문을 사용하여 hap이 500을 초과할 경우, 현재 메서드를 호출한 곳으로 결과값을 복귀(return)하게 처리함

public class ReturnExam01 {

	public static void main(String[] args) {
		int hap = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			hap += i;
		
			if(hap > 500) {
				System.out.printf("hap 변수값이 500을 넘은 숫자는 %d입니다. \n", hap);
				return;
			}
		}
	}

}
