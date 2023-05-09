package source08_review.methodex;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Test02_02 {
	// 인자값이 2개 있는 메소드 선언
	public void print(double a, double b) {
		double c = a + b;
		System.out.println("결과 값 = " + c);
	}
	
	// 인자값으로 문자열을 받는 메소드를 선언
	public void printMessage(String str) {
		System.out.println("결과 값 = " + str);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("덧셈을 희망하는 첫번째 수를 입력해 주시기 바랍니다. ==> ");
		double num1 = scan.nextDouble();
		System.out.println("덧셈을 희망하는 두번째 수를 입력해 주시기 바랍니다. ==> ");
		double num2 = scan.nextDouble();
		System.out.println("화면에 출력하고 싶은 문자열을 입력해 주시기 바랍니다. ==> ");
		String str = scan.next();
		
		Test02_02 method = new Test02_02();
		method.print(num1, num2);
		method.printMessage(str);
		
		scan.close();
	}
}
