package source08_review;

import java.util.Scanner;

class Test01_01 {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해 주세요. ===>");
		int n1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요. ===>");
		int n2 = scan.nextInt();
		
		int total = addNum(n1, n2);
		System.out.println(total);

		sayHello("안녕");
		
		int num = calcSum();
		System.out.println(num);
		
		scan.close();
	}

}
