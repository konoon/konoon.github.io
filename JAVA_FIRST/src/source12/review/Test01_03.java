package source12.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01_03 {

	public static void main(String[] args) {
		int a, b, result;
		
		Scanner inputData = new Scanner(System.in);
		System.out.println("궁금하신 구구단 값을 입력해 주세요. ==> "); 
		a = inputData.nextInt();
		
		try {
			for(b = 1; b <= 9; b++) {
				result = a * b;
				System.out.printf("%d X %d = %d \t", a, b, result);
				System.out.println("");
			}
		} catch (InputMismatchException e) {
			System.out.println("에러 정수를 입력");
		} finally {
			inputData.close();
		}
	} 
}
