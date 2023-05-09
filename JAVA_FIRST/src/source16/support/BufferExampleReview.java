package source16.support;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExampleReview {
	public static void main(String[] args) throws Exception {

		// 기본 스트림만 생성 활용
		String downloadFile1Path = BufferExampleReview.class.getResource("downloadFile1.jpg").getPath();
//		System.out.println(downloadFile1Path);
		String backupFile1Path = "c:/Test/backupFile1.jpg";
		FileInputStream fis = new FileInputStream(downloadFile1Path);
		FileOutputStream fos = new FileOutputStream(backupFile1Path);
		
		// 기본 스트림에 버퍼 보조 스트림 연결 활용
		String downloadFile2Path = BufferExampleReview.class.getResource("downloadFile2.jpg").getPath();
//		System.out.println(downloadFile2Path);
		String backupFile2Path = "c:/Test/backupFile2.jpg";
		FileInputStream fis2 = new FileInputStream(downloadFile2Path);
		FileOutputStream fos2 = new FileOutputStream(backupFile2Path);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// FileInputStream, FileOutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때 복사 시간 = " + nonBufferTime + "ns");
		
		// BufferedInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 복사 시간 = " + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 복사 시작 시간 저장
		// [파일 복사] 원본 파일에서 읽은 1byte를 백업 파일로 바로 출력 처리함
		while (true) {
			data = is.read();
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime(); // 복사 끝 시간 저장
		return (end - start); // 복사에 걸린 시간을 리턴 처리해 줌.
	}
}
