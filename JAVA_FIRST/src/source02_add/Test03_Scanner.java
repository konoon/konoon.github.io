package source02_add;

import java.util.Scanner;

public class Test03_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scan.nextLine();
			System.out.println("입력된 문자열: " + inputData);
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
//		scan.close();
	}

}
