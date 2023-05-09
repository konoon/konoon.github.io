package source16.io;

import java.io.File;
import java.util.Scanner;

public class Test01_Scanner {
	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner("김연아/여성/30대").useDelimiter("/");
//		Scanner scan = new Scanner("김연아/여성/30대");
//		Scanner scan = new Scanner(new File("c:/Test/scanner.txt"));
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열과 구분문자 / 활용 구문을 입력해 주시기 바랍니다. ==> ");
		String inputStr = scan.nextLine();
		Scanner lineOut = new Scanner(inputStr);
		lineOut.useDelimiter("/"); // Delimiter: 구분 문자
//		scan.useDelimiter("/");
		
		while (lineOut.hasNext()) {
			System.out.println(lineOut.next());
		}
		lineOut.close();
		scan.close();
	}
	
}
