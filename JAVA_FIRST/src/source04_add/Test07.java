package source04_add;

public class Test07 {

	public static void main(String[] args) {
		// continue문을 사용해서, i값을 3으로 나눈 나머지 값이 0이면(3의 배수라면) 블록의 끝으로 건너뛰고 다시 for문의 시작으로  돌아가서 계속 처리하여 1~100까지의 합을 구하는 프로그램 제작
		
		int hap = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			if(i % 3 == 00) { // if(i % 3 == 00)는 i가 3의 배수라면 가정 
				continue; // for문의 처음으로 감
			}
			// System.out.println(i);
			hap += i;
		}
		System.out.printf("3의 배수를 제외한 1~100까지의 합 = %d\n", hap);
	}

}
