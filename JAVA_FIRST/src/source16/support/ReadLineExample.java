package source16.support;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {

		// 문자 기반 입력 스트림 얻기
//		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		Reader reader = new FileReader("c:/Test/programming.txt");
//		Reader reader = new FileReader("c:\\Test\\programming.txt");
		
//		System.out.println(reader);
		
		// BufferedReader 보조 스트림 연결
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			// readLine() 메서드는 라인 단위 문자열을 읽고 리턴해 줌.
			String data = br.readLine();
			if(data == null) {  // 파일 끝에 도달해서 데이터가 없다면(null값 이면)
				break;
			}
			System.out.println(data);
			
		}
	}

}
