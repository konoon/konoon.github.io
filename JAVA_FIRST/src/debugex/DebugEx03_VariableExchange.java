package debugex;

public class DebugEx03_VariableExchange {
	public static void main(String[] args) {  // BreakPoint 찍어봄 : Step Over(F6) 실행해 봄

		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y : " + y);
	}
}

/* 실행 결과 흐름

x 변수 3 → temp 변수 3

y변수 5 → x 변수 5

temp 변수 3 → y 변수 3

*/

/* 실행 결과
x : 3, y : 5
x : 5, y : 3
*/
