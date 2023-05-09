package source16.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test06_Paths_Files {
	public static void main(String[] args) throws IOException {
		
		System.out.println("운영체제 종류 : " + System.getProperty("os.name"));
		System.out.println("");
		
		// Paths 경로 지정 : C드라이브에 nio.txt 파일을 생성하기 위함.
		Path path = Paths.get("c:/Test/nio.txt");
		Files.createDirectories(path.getParent());
		
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE); // 파일 생성(CREATE), data 기록(WRITE)
		
		String data = "abc"; // String 형의 data 변수에 문자열값 abc 대입해 줌
		// 문저셋은 코딩 프로그램에 셋팅된 값으로 UTF-8 또는 ANSI 등 설정됨.
		Charset charset = Charset.defaultCharset();
		ByteBuffer byteBuffer = charset.encode(data);
		// 파일에 쓰여지는 바이트는 ByteBuffer의 position부터 limit 까지이며,
		// 여기서는 data 3글자임.
		
		// abc : 1글자당 1bytes, 3글자 3bytes
		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("nio.txt : " + byteCount + " bytes written");
		
		fileChannel.close(); // 채널 클로징(닫기)
	}
}

/* 실행 결과
운영체제 종류 : Windows 10

nio.txt : 3 bytes written
*/
