package source16;

import java.io.FileInputStream;
import java.io.InputStream;

// 길이가 100인 배열을 생성하고 read(byte[]b) 메서드로 한꺼번에 100byte를 읽고
// 배열에 저장합니다. 즉, 파일에 읽을 바이트가 100개 이상이 남아있을 경우에만
// 100byte를 한꺼번에 읽게 됩니다. 그렇지 않으면 읽을 수 있는 바이트 수만큼만 읽게 됩니다.
public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test2.db로 하는 바이트 기반 파일 입력 스트림을 생성함
		InputStream is = new FileInputStream("c:/Test/test2.db");
		
		byte[] buffer = new byte[100]; // 길이 100인 배열 생성
		
		while (true) {
			int readByteNum = is.read(buffer); // 배열 길이 만큼 읽기
			if(readByteNum == -1) {  // 파일 끝(-1)까지 도달했을 경우 break문을 처리함
				break;
			}
			// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력 처리함
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);			
			}
		}
		is.close(); // 입력 스트림을 닫아줌.
	}
}
