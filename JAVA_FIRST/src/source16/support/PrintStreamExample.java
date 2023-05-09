package source16.support;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

// FileOutputStream에 보조 스트림으로 PrintStream을 연결해서
// print()와 println() 메서드로 문자열을 출력하는 자바 프로그램 제작
public class PrintStreamExample {
	public static void main(String[] args) throws Exception {

		// 바이트 기반 출력 스트림을 생성하고 PrintStream 보조 스트림 연결 처리함
		FileOutputStream fos = new FileOutputStream("c:/Test/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		// 라인 단위로 문자열을 출력 처리함.
		ps.println("[프린터 보조 스트림]");
		ps.println("마치");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");

		System.out.println("정상적으로 처리가 되었습니다!");
		// 버퍼에 잔류하는 문자열을 모두 비워서 처리해 주시고, 출력 스트림을 닫아줌.
		ps.flush();
		ps.close();
	}
}
