package source16;

import java.io.FileReader;
import java.io.Reader;

// Ctrl + Shift + O : 임포트 정리 단축키
// 앞서 test7.txt 파일에 저장한 내용을 한문자씩 끝까지 읽는 것을 처리하는 자바 프로그램 제작
public class ReadExample4 {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test7.txt로 하는 바이트 기반 파일 입력 스트림을 생성함
		Reader reader = new FileReader("c:/Test/test7.txt");
		while (true) {
			int data = reader.read(); // 한 문자씩 데이터 읽어 오기
			if(data == -1) { // 파일 끝(-1)까지 도달했을 경우
				break;
			}
			System.out.print((char)data + " ");
		}
		reader.close(); // 입력 스트림을 닫아줌.
	}
}
