package source16.io;

import java.io.IOException;
import java.io.OutputStream;

public class Test03_OutputStream {

	public static void main(String[] args) throws Exception {
		OutputStream out = System.out;
		byte b[] = {65, 66, 67, 68};
		out.write(b);
		System.out.println("");
		
		// b배열의 1번 인덱스부터 2개 배열 요소 출력하기
		out.write(b, 1, 2);
		
		int n = 100;
		System.out.println("");
		out.write(n); // 아스키코드값100: d 출력
		// 버퍼가 다 차지 않아도 데이터를 버퍼에서 내보내면서 화면으로 출력함
		out.flush();
		out.close();
	}

}
