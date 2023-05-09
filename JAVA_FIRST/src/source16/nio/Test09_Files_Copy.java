package source16.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Files 클래스의 copy() 메서드 활용 파일 복사 자바 프로그램 제작
public class Test09_Files_Copy {

	public static void main(String[] args) throws IOException {

		// C드라이브 Test 폴더 안에 images 폴더 안에 있는 origin1.jpg 파일을
		Path from = Paths.get("c:/Test/images/origin1.jpg");
		
		// C드라이브 Test 폴더 안에 images 폴더 안에 origin2.jpg 파일로
		Path to = Paths.get("c:/Test/images/origin2.jpg");
		
		// Files.copy() 메서드 활용 표준카피옵션.REPLACE_EXISTING 적용 copy 실행함.
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사가 성공했습니다!");
	}
}

/* 실행 결과
파일 복사가 성공했습니다!
*/
