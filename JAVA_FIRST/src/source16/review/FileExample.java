package source16.review;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// C드라이브 Test 폴더에 images 폴더와 file1.txt, file2.txt, file3.txt 파일을 생성하고,
// Test 폴더에 있는 파일 목록을 출력하는 자바 프로그램 제작

// File 클래스를 활용한 파일 및 폴더 정보 출력 자바 프로그렘 제작
public class FileExample {
	public static void main(String[] args) throws Exception {
		
		// 경로 구분자는 운영체제마다 조금씩 다릅니다.
		// 윈로우에서는 \ 또는 /를 둘 다 사용할 수 있고,
		// 유닉스나 리눅스에서는 /를 사용합니다.
		// 만약 윈도우에서 \를 경로  구분자로 사용하고 싶다면 이스케이프 문자(\\)로 기술해야 합니다.
		// File 객체 생성
		File dir = new File("c:/Test/images");
		File file1 = new File("c:/Test/file1.txt");
		File file2 = new File("c:/Test/file2.txt");
		File file3 = new File("c:/Test/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않으면 생성 처리함
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		// C:/Test 폴더의 내용 목록을 File 배열로 얻음
		File testList = new File("c:/Test");
		File [] contents = testList.listFiles();
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("=================================================================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()){
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}

/* 실행 결과
시간					형태		크기			이름
=================================================================
2022-06-17 오후 17:09			381547	backupFile1.jpg
2022-06-17 오후 17:09			381547	backupFile2.jpg
2022-06-17 오후 18:24			386		board.db
2022-06-17 오전 11:45			27		config.properties
2022-06-20 오전 11:42			88		fighting.txt
2022-06-16 오후 17:54			21		file1.txt
2022-06-21 오전 10:27			0		file2.txt
2022-06-21 오전 10:27			0		file3.txt
2014-02-11 오전 09:06			50670	house1.jpg
2022-06-20 오후 15:24			50670	house2.jpg
2022-06-21 오전 10:30	<DIR>			images
2022-06-17 오후 17:32			36		language.txt
2022-06-20 오후 14:21			3		nio.txt
2022-06-17 오후 18:00			46		primitive.db
2022-06-17 오후 18:06			106		printstream.txt
2022-06-17 오후 17:47			85		programming.txt
2022-06-20 오후 13:05			22		scan.txt
2022-06-20 오후 13:44			22		scanner.txt
2022-06-16 오후 18:28			19823	targetFile1.jpg
2022-06-16 오후 18:28			19823	targetFile2.jpg
2022-06-16 오후 16:02			3		test1.db
2022-06-16 오후 17:03			9		test10.txt
2022-06-16 오후 16:06			3		test2.db
2022-06-16 오후 16:09			3		test3.db
2022-06-16 오후 16:50			3		test7.txt
2022-06-16 오후 16:54			3		test8.txt
2022-06-16 오후 16:57			3		test9.txt
2022-06-20 오전 10:38			4		text01.txt
2022-06-17 오후 16:14			30		write.txt
2022-06-17 오후 16:26			51		write1.txt
*/