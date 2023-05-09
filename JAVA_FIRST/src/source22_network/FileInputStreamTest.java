package source22_network;

import java.io.FileInputStream;
import java.io.IOException;

// 바이트 배열을 생성하고 배열을 사용하여 자료를 읽어보기

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\JAVA_STUDY\\JAVA_FIRST\\src\\source22_network\\input.txt");
			// 10바이트 크기 배열 생성
			byte [] bs = new byte[10];
			
			int i;
			// i값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해 읽어옴
			while ((i = fis.read(bs)) != -1) {
//				for (int b : bs) {
//					System.out.print((char)b);
//				}
				for (int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트를 읽음");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fis.close(); // 열린 스트림은 파이널리 블록에서 닫아줌
			} catch (IOException e2) {
				System.out.println(e2);
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
		}
	}
	
	
}
