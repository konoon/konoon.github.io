package source13;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// 베열의 offset 인덱스 위치 6번째부터 4개까지 String으로 전환
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
