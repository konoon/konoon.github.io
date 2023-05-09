package source16;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExample6 {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test9.txt로 하는 바이트 기반 파일 입력 스트림을 생성함
		Reader reader = new FileReader("c:/Test/test9.txt");
		
		char[] buffer = new char[5]; // 길이 5인 배열 생성
		
		// 입력 스트림으로부터 3개의 문자를 읽고
		// buffer[2], buffer[3], buffer[4]에 각각 저장 처리함
		int readCharNum = reader.read(buffer, 2, 3);
		
		if(readCharNum != -1) {  // 읽은 문자가 있다면
			for (int i = 0; i < buffer.length; i++) {
				// 배열 전체를 읽어서 출력 처리함
				System.out.println(buffer[i]);				
			}
		}
		reader.close(); // 입력 스트림을 닫아줌.
	}
}
