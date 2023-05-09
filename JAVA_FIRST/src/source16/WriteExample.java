package source16;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 10, 20, 30이 저장된 각각의 바이트를 파일 C:\Test\test1.db로 출력해서
// test1.db의 내용으로 저장합니다. 이때, 1byte씩 출력 처리를 적용 합니다.
public class WriteExample {
	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림을 생성함
		OutputStream os = new FileOutputStream("c:/Test/test1.db");
		byte a = 10;
		byte b = 20;
		byte c = 30;
		// 1byte씩 출력 처리함
		os.write(a);
		os.write(b);
		os.write(c);
		System.out.println("파일이 정상적으로 생성되었습니다!");
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		// 출력 스트림을 닫음
		os.close();	
	}
}
