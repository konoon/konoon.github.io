package source03;

import java.util.Scanner;

public class Test08_InputScanner {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("[필수 정보 입력 바랍니다.]");
		
		System.out.println("1. 이름입력 ==> ");
		String name = inputScan.nextLine();
		
		System.out.println("2. 주민번호 ==> ");
		String idNumber = inputScan.nextLine();
		
		System.out.println("=====");
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름" + name);
		System.out.println("2. 주민번호" + idNumber);
		
		inputScan.close();

	}

}
