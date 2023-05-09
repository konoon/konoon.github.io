package source13;

public class MathExample {

	public static void main(String[] args) {
		
		int num1 = Math.abs(-5);
		System.out.println("num1 변수값 : " + num1);
		
		double num2 = Math.abs(-3.14);
		System.out.println("num2 변수값 : " + num2);
		
		double num3 = Math.ceil(5.3);
		System.out.println("num3 변수값 : " + num3);

		double num4 = Math.ceil(-5.3);
		System.out.println("num4 변수값 : " + num4);
		
		double num5 = Math.floor(5.3);
		System.out.println("num5 변수값 : " + num5);

		double num6 = Math.floor(-5.3);
		System.out.println("num6 변수값 : " + num6);
		
		int num7 = Math.max(5, 9);
		System.out.println("num7 변수값 : " + num7);

		double num8 = Math.max(5.3, 2.5);
		System.out.println("num8 변수값 : " + num8);
		
		int num9 = Math.min(5, 9);
		System.out.println("num9 변수값 : " + num9);

		double num10 = Math.min(5.3, 2.5);
		System.out.println("num10 변수값 : " + num10);
		
		double num11 = Math.random();
		System.out.println("num11 변수값 : " + num11);
		System.out.println("num11의 반올림 값 : " + Math.round(num11));
		
		double num12 = Math.rint(5.1); // 5.0 ~ 5.4 까지는 5.0
		System.out.println("num12 변수값 : " + num12);
		
		double num13 = Math.rint(5.7); // 5.5 ~ 5.9 까지는 6.0
		System.out.println("num13 변수값 : " + num13);
		
		long num14 = Math.round(5.3);
		System.out.println("num14 변수값 : " + num14);
		
		long num15 = Math.round(5.7);
		System.out.println("num15 변수값 : " + num15);
	}

}
