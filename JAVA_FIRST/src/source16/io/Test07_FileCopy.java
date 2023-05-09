package source16.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일을 복사하는 자바 프로그램을 제작함.
// 예시) nice.txt 파일을 복사해서 copy.txt 파일로 만들어 줍니다.
public class Test07_FileCopy {
	public static void main(String[] args) {

		FileInputStream fin = null;
		FileOutputStream fos = null;
		
		try {
			fin = new FileInputStream("c:/Test/nice.txt");
			byte b [] = new byte[100]; // 저장 공간 초기화
			while (true) {
				// read() 메서드는 파일에서 읽어온 데이터를 b에 저장하고
				// 읽어온 바이트수 크기를 리턴합니다. n에는 읽어온 바이트수 크기가
				// 저장되고 파일 끝이면 -1이 저장됩니다.
				int n = fin.read(b);
				if(n==-1) {
					break;
				}
				fos = new FileOutputStream("c:/Test/copy.txt");
				fos.write(b); // 파일로 b배열 출력
				fos.close(); // 스트림 닫기
				System.out.println("파일 복사 성공!");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
