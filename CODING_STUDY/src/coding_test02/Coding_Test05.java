package coding_test02;

// 다음 결과값과 같이 출력되도록 if문과 break, continue를
// 이용해서 for문 코드를 완성하시기 바랍니다.
// 다음 결과값 : 0, 2, 4, 6, 8, 10 

public class Coding_Test05{
	public static void main(String[] args) {
		for (int i = 0; ; i++) {
			if(i % 2 == 1) {
				continue;
			}
			if(i > 10) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}