package source16.support;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
// 성능 향상 보조 스트림(BufferedInputStream, BufferedOutputStream)을 사용했을 때와
// 사용하지 않았을 때의 파일 복사 실행 성능 차이를 보여주는 자바 프로그램을 제작해 봅니다.
// 실행 결과를 보면 보조 스트림을 사용했을 때 훨씬 성능이 좋아지는 것을 알 수 있습니다.

// 파일 복사 성능 테스트용 자바 프로그램 제작
public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		// 기본 스트림만 생성 활용
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "c:/Test/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 기본 스트림에 버퍼 보조 스트림 연결 활용
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "c:/Test/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// FileInputStream, FileOutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
	
		// BufferedInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();  // 복사 시작 시간 저장
		// [파일 복사] 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력 처리함
		while (true) {
			data= is.read();
			if (data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();  // 복사 끝 시간 저장
		return (end-start);  // 복사에 걸린 시간을 리턴 처리해 줌.
	}
}
