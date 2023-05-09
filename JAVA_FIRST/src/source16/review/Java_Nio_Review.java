package source16.review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// 자바 nio Files 클래스의 copy() 메서드 활용 파일 복사 자바 프로그램 제작
public class Java_Nio_Review {
	public static void main(String[] args) throws IOException {
		
		// C드라이브 Test 폴더 안에 download 폴더 안에 있는 downimage1.jpg 파일을
		Path from = Paths.get("c:/Test/download/downimage1.jpg");
		
		// C드라이브 Test 폴더 안에 download 폴더 안에 downimage2.jpg 파일로
		Path to = Paths.get("c:/Test/download/downimage2.jpg");
		
		// 자바 nio Files.copy() 메서드 활용 표준카피옵션.REPLACE_EXISTING 적용
		// 파일 복사 실행 처리함.
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사가 성공했습니다!");
	}
}
