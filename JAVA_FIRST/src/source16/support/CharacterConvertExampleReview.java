package source16.support;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class CharacterConvertExampleReview {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해 주시기 바랍니다 ==> ");
		String inputStr = scan.nextLine();
		
		write(inputStr);
		String data = read();
		System.out.println("\"" + data + "\" 문자열 입력이 정상적으로 처리되었습니다!");
		scan.close();		
	}

	public static String read() throws Exception {
		
		FileInputStream fis = new FileInputStream("c:/Test/write1.txt");
		Reader reader = new InputStreamReader(fis);
		char [] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

	public static void write(String inputStr) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/Test/write1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(inputStr);
		writer.flush();
		writer.close();
	}
}
