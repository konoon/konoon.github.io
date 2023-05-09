package source16.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class Test06_FileInputStream {
	public static void main(String[] args) {

		FileInputStream fin = null;
		OutputStream oos = System.out;
		try {
			fin = new FileInputStream("c:/Test/nice.txt");
			while (true) {
				int n = fin.read();
				if(n == -1) {  // n == -1 : 파일을 끝(-1)까지 읽은 경우
					break;
				}
				oos.write((char) n);
			}
			oos.close();
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다!");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
