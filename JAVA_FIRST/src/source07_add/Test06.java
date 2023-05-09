package source07_add;

public class Test06 {

	public static void main(String[] args) {
		// 2차원 배열 for문 활용 구현 프로그램 제작
		
		int [][] aa = new int [3][4]; // 2차원 배열을 선언함
		int i, k; // 배열의 첨자로 사용할 변수를 선언함
		int val = 1; // 배열에 들어갈 값을 초기화 함
	
		for (i = 0; i < aa.length; i++ ) {
//			System.out.println(i);
			for(k = 0; k < (aa.length + 1); k++) {
				System.out.println(k);
				aa[i][k] = val;
				val++;
			}
		}
		System.out.println("<aa[0][0]부터 aa[2][3]까지 출력>\n");
		// 입력과 동일한 개념으로 12회동안 각 값들을 화면으로 출력해줌
		for(i = 0; i < aa.length; i++) {
			for(k = 0; k < (aa.length + 1); k++) {
				// 입력과 동일한 개념으로 12회동안 각 값들을 화면으로 출력해줌
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println("");
		}
	}

}
