package source16;

import java.io.FileInputStream;
import java.io.InputStream;

// C드라이브의 Test 폴더 안에 있는 test3.db에서 3byte를 읽고,
// 길이 5인 배열의 배열[2], 배열[3], 배열[4]에 저장합니다.
// 여기서, test3.db 파일은 앞서 출력 스트림에서 생성했던 파일을 활용합니다.
public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림을 생성함
		InputStream is = new FileInputStream("c:/Test/test3.db");
		
		byte[] buffer = new byte[5]; // 길이 5인 배열 생성
		
		int readByteNum = is.read(buffer, 2, 3);
		
		if(readByteNum != -1) {  // 읽은 바이트가 있다면
			for (int i = 0; i < buffer.length; i++) {
				// 배열 전체를 읽어서 출력 처리함
				System.out.println(buffer[i]);				
			}
		}
		is.close(); // 입력 스트림을 닫아줌.
	}
}
