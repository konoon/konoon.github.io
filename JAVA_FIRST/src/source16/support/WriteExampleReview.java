package source16.support;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

// 문자열을 C드라이브의 Test 폴더 안에  write.txt 파일로 출력 저장하는 자바 프로그램 제작
public class WriteExampleReview {
	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("c:/Test/write.txt");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해 주시기 바랍니다 ==> ");
		String inputStr = scan.nextLine();
		
		String str = inputStr;
		
		// 문자열 전체를 출력 처리함
		writer.write(str);
		
		System.out.println("정상적으로 처리가 되었습니다!");
		// 출력 버퍼에 잔류하는 모든 문자를 비워주면서 출력 처리함.
		scan.close();
		writer.flush();
		// 출력 스트림을 닫아줌.
		writer.close();
		
	}
}
