package source16;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 10, 20, 30, 40, 50이 저장된 배열에서 20, 30, 40을 선별적으로 선택하여
// 파일 C:\Test\test2.db로 출력해서 test3.db의 내용으로 저장합니다.
public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test3.db로 하는 바이트 기반 파일 출력 스트림을 생성함
		OutputStream os = new FileOutputStream("c:/Test/test3.db");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		// 배열의 1번 인덱스부터 3개의 데이터를 출력 스트림 처리함.
		os.write(array, 1, 3);
		
		System.out.println("파일이 정상적으로 생성되었습니다!");
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		// 출력 스트림을 닫음
		os.close();	
	}
}
