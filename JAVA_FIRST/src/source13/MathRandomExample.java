package source13;

public class MathRandomExample {

	public static void main(String[] args) {
		double num = Math.random();
		System.out.println("num 변수 값 " + num);
		
		int numInt = (int)(num * 6);
		System.out.println("numInt 변수 값 " + numInt);
	}
}
