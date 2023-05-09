package source16;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

// 길이가 100인 배열을 생성하고 read(char[] cbuf) 메서드로 한꺼번에 100개의 문자를 읽고
// 배열에 저장합니다. 즉, 파일에 읽을 문자가 100개 이상이 남아있을 경우에만
// 100개의 문자를 한꺼번에 읽게 됩니다. 그렇지 않으면 읽을 수 있는 문자 수만큼만 읽게 됩니다.
public class ReadExample5 {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test8.txt로 하는 바이트 기반 파일 입력 스트림을 생성함
		Reader reader = new FileReader("c:/Test/test8.txt");
		
		char[] buffer = new char[100]; // 길이 100인 배열 생성
		
		while (true) {
			int readCharNum = reader.read(buffer); // 배열 길이 만큼 읽기
			if(readCharNum == -1) {  // 파일 끝(-1)까지 도달했을 경우 break문을 처리함
				break;
			}
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력 처리함
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);			
			}
		}
		reader.close(); // 입력 스트림을 닫아줌.
	}
}
