package source16;

import java.io.FileInputStream;
import java.io.InputStream;

// 앞서 WriteExample에서 C드라이브의 Test 폴더에 바이트 출력 스트림으로 생성한
// test1.db 파일에 저장한 내용을 1byte씩 끝까지 읽어주는 프로그램 소스 코딩 예시
public class ReadExample {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test1.db로 하는 바이트 기반 파일 입력 스트림을 생성함
		InputStream is = new FileInputStream("c:/Test/test1.db");
		while (true) {
			int data = is.read(); // 1byte씩 읽기
			if(data == -1) {  // 파일 끝(-1)까지 도달했을 경우 break문을 처리함
				break;
			}
			System.out.println(data);			
		}
		is.close(); // 입력 스트림을 닫아줌.
	}
}
