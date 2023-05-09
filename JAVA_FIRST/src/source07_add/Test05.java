package source07_add;

public class Test05 {

	public static void main(String[] args) {
		// 2차원 배열을 3행 4열짜리 12개 메모리 공간을 생성해서 배열명 aa에 공간을 메모리 할당함
		int [][] aa = new int[3][4];
		
		aa[0][0] = 1;
		aa[0][1] = 2;
		aa[0][2] = 3;
		aa[0][3] = 4;
		aa[1][0] = 5;
		aa[1][1] = 6;
		aa[1][2] = 7;
		aa[1][3] = 8;
		aa[2][0] = 9;
		aa[2][1] = 10;
		aa[2][2] = 11;
		aa[2][3] = 12;
		
		System.out.println("<aa[0][0]부터 aa[2][3]까지 화면으로 출력함> \n");
		System.out.printf("%3d %3d %3d %3d\n", aa[0][0], aa[0][1], aa[0][2], aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[1][0], aa[1][1], aa[1][2], aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n", aa[2][0], aa[2][1], aa[2][2], aa[2][3]);
	}

}
