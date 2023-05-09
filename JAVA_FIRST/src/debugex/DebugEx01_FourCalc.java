package debugex;

//산술 연산자 활용

public class DebugEx01_FourCalc {
	public static void main(String[] args) {
		
		int a, b = 5, c = 3; 

		a = b + c; // (1) BreakPoint 찍어봄 : Step Over(F6) 실행해 봄
		System.out.printf(" %d + %d = %d  \n", b, c, a);

		a = b - c;
		System.out.printf(" %d - %d = %d  \n", b, c, a);

		a = b * c;
		System.out.printf(" %d * %d = %d  \n", b, c, a);

		a = b / c;
		System.out.printf(" %d / %d = %d  \n", b, c, a);

		a = b % c;
		System.out.printf(" %d %% %d = %d  \n", b, c, a);
	}
}
