package source16.support;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 것을 처리하는 자바 프로그램을 제작합니다.
// 사용하는 소스 스트림은 바이트 기반 FileOutputStream과 FileInputStream입니다.
// 하지만, 이들 스트림을 직접 사용하지 않고, 각각 Writer와 Reader로 변환해서 입출력 처리를 합니다.
public class CharConvertStreamExample {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해 주시기 바랍니다! ==>");
		String inputStr = scan.nextLine();		
		
		write(inputStr);
		String data = read();
		System.out.println(data);
		scan.close();
	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("c:/Test/file1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		// InputStreamReader 보조 스트림을 이용해서 문자를 입력 처리함.
		int readCharNum = reader.read(buffer);
		reader.close();
		// char 배열에서 읽은 수만큼 문자열로 변환 처리함. 
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

	public static void write(String str) throws Exception {
		// FileOutputStream에 OutputStreamWriter 보조 스트림을 연결 처리함.
		FileOutputStream fos = new FileOutputStream("c:/Test/file1.txt");
		Writer writer = new OutputStreamWriter(fos);
		// OutputStreamWriter 보조 스트림을 이용해서 문자 출력을 처리함.
		writer.write(str);
		writer.flush();
		writer.close();
	}
}
