package source16.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

// BufferedReader 클래스를 사용해 파일을 읽어오는 프로그램 제작

public class Test10_BufferedReader {
	public static void main(String[] args) throws Exception {

		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("읽어올 파일 이름을 입력해 주시기 바랍니다 ==> ");
		file = read.readLine(); // 파일 이름을 사용자로부터 입력 받습니다!
		System.out.println(file + ": 문서 내용은 아래와 같습니다! ");
		
		// FileReader 클래스를 이용해 파일을 읽어들입니다!
		FileReader fr = new FileReader(file);
		
		// BufferedReader 클래스를 사용해 버퍼링 처리를 합니다!
		BufferedReader br = new BufferedReader(fr);
		
		// (i = br.read()) != -1 : 입력된 값들을 끝까지 읽어옴
		while ((i=br.read()) != -1) {
			System.out.print((char)i); // 파일을 읽어 화면에 출력합니다.
		}
		br.close(); // 스트림을 닫습니다.
	}
}
