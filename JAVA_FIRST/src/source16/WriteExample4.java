package source16;

import java.io.FileWriter;
import java.io.Writer;

// Ctrl+Shift+O : 임포트 자동 처리
public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림을 생성함
		Writer writer = new FileWriter("c:/Test/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		System.out.println("정상적으로 처리가 되었습니다!");
		// 출력 버퍼에 잔류하는 모든 문자를 비워주면서 출력 처리함.
		writer.flush();
		// 출력 스트림을 닫아줌.
		writer.close();
	}
}
