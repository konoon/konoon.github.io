package source07_add;

import java.util.Scanner;

public class Test06_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 입력 받은 수를 저장하는 행의 개수 변수 row, 열의 변수 column을 선언함
		int row, column;
		System.out.println("행의 개수를 입력해 주세요. ==> ");
		row = s.nextInt(); // 행의 개수를 row 변수에 대입해 줌
		System.out.println("열의 개수를 입력해 주세요. ==> ");
		column = s.nextInt(); // 열의 개수를 column 변수에 대입해 줌
		
		// 배열 선언 시 변수로 첨자를 사용함. 즉, 동적으로 크기를 할당하게 함
		int [][] aa = new int[row][column];
		int i, k;
		int val = 1;

		for (i = 0; i < row; i++ ) {
			for(k = 0; k < column; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		
		System.out.printf("<aa[0][0]부터 aa[%d][%d]까지 출력>\n", (row-1), (column-1));
		// 입력과 동일한 개념으로 12회동안 각 값들을 화면으로 출력해줌
		for(i = 0; i < row; i++) {
			for(k = 0; k < column; k++) {
				// 입력과 동일한 개념으로 12회동안 각 값들을 화면으로 출력해줌
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println("");
		} s.close();
	}

}
