package source13;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// 읽어들인 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.print("영문자를 입력해 주시기 바랍니다. ==> ");
		// 배열에서 읽은 바이트를 저장하고 읽어들인 바이트 수를 리턴함
		int readByteNo = System.in.read(bytes);
		
		// 배열을 문자열로 변환해 주는 구문
		// readByteNo - 2 -> 캐리지리턴(\r) + 라인피드 (\n) 부분은 문자열로 만들 필요가 없기때문에 사용
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}

}
