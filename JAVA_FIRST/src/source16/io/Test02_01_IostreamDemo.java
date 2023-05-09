package source16.io;

import java.io.IOException;

public class Test02_01_IostreamDemo {
	public static void main(String[] args) throws Exception {

		int b, len = 0;
		int ba[] = new int[100];
		
		System.out.println("=== 입력 스트림 ===");
		// != '\n' : 줄바꿈(\n)이 되지 않을때까지(!=) 의미함
		while ((b = System.in.read()) != '\n') {
			System.out.printf("%c(%d)", (char)b, b);
			ba[len++] = b;			
		}
		System.out.println("\n\n=== 출력 스트림 ===");
		for (int i = 0; i < len; i++) {
			System.out.write(ba[i]);
		}
		System.out.flush(); // flush() : 버퍼 메모리를 비워줍니다.
	}
}
/* 실행 결과
=== 입력 스트림 ===
hello
h(104)e(101)l(108)l(108)o(111)
(13)

=== 출력 스트림 ===
hello
*/
