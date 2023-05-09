package source16.io;

import java.io.IOException;
import java.io.InputStream;

public class Test02_02_InputStream {
	public static void main(String[] args) {

		InputStream is = System.in;
		
		System.out.println("영문자 하나를 입력해 주시기 바랍니다 ==> ");
		try {
			int ch = is.read();
			System.out.println("입력 문자 아스키 코드 값 = " + ch);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
