package source16.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test08_Paths_Copy {
	public static void main(String[] args) throws IOException {

		// Paths 경로 C드라이브에 Test 폴더에 잇는 house1.jpg 파일을
		Path from = Paths.get("c:/Test/house1.jpg");
		// Paths 경로 C드라이브에 Test 폴더에 house2.jpg 파일로 복사 처리함
		Path to = Paths.get("c:/Test/house2.jpg");
		
		// FileChannel READ 읽기 속성 부여
		FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
		
		// FileChannel READ 읽은 데이터에 대한 CREATE 생성 WRITE 쓰기 속성 부여
		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
		
		// allocateDirect() 메서드는 JVM 힙 메모리 바깥쪽,
		// 즉 운영체제가 관리하는 메모리에 다이렉트 버퍼를 생성합니다.
		ByteBuffer buffer = ByteBuffer.allocate(100);
		
		int byteCount;
		while (true) {
			buffer.clear();
			byteCount = fileChannel_from.read(buffer);
			// 파일에서 읽혀지는 바이트는 ByteBuffer의 position부터
			// 저장 버퍼에 한 바이트를 저장할 때마다 position이 1씩 증가함.
			// 버퍼에 저장한 마지막 바이트의 위치는 position-1 인덱스까지이며,
			// 한 번 읽을 수 있는 최대 바이트 수는 position부터 ByteBuffer의 capacity까지임
			if(byteCount == -1) {  // byteCount가 끝까지(없을때) -1이면 break;문 처리함
				 break;
			}
			buffer.flip();
			// flip() 메서드는 버퍼에 저장된 position을 0으로 설정하고,
			// limit를 현재 버퍼에 저장된 내용의 마지막 위치로 이동 처리합니다.
			
		fileChannel_to.write(buffer); // fileChannel 이용 buffer copy write;		
		}
		fileChannel_from.close(); // fileChannel_from 클로징(닫기)
		fileChannel_to.close(); // fileChannel_to 클로징(닫기)
		System.out.println("파일 복사에 성공했습니다!");		
	}
}

/* 실행 결과
파일 복사에 성공했습니다!
*/