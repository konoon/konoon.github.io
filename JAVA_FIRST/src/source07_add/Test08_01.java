package source07_add;

import java.util.Scanner;

public class Test08_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		
//		int i = 0;
//		System.out.println(i++ + 1 + "번째 국어점수 = ");
//		a[0] = scan.nextInt();
//		System.out.println(i++ + 1 + "번째 국어점수 = ");
//		a[1] = scan.nextInt();
//		System.out.println(i++ + 1 + "번째 국어점수 = ");
//		a[2] = scan.nextInt();
//		System.out.println(i++ + 1 + "번째 국어점수 = ");
//		a[3] = scan.nextInt();
//		System.out.println(i++ + 1 + "번째 국어점수 = ");
//		a[4] = scan.nextInt();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println((i+1) + "번째 국어점수 = ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("============\n");
		System.out.println("[입력된 학생의 점수]");
		for(int input : a) {
			System.out.println(input + " ");
		}
		scan.close();
	}

}
