package source08_class_ex;

import java.util.Scanner;

class Test02_01 {
	double x;
	double y;
	
	public Test02_01(double a, double b) {
		x = a;
		y = b;
	}
	
	public double add() {
		return (x + y);
	}
}

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 덧셈 숫자를 입력해 주세요. ==> ");
		double num1 = scan.nextDouble();
		System.out.println("두번째 덧셈 숫자를 입력해 주세요. ==> ");
		double num2 = scan.nextDouble();
		
		Test02_01 sample = new Test02_01(num1, num2);

		System.out.println(sample.x);
		System.out.println(sample.y);
		System.out.println(sample.add());
		
		scan.close();
	}

}
