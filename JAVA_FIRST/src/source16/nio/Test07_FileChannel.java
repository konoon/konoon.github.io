package source16.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test07_FileChannel {
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("c:/Test/nio.txt");
		
		// FileChannle READ 읽기
		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
		
		// allocate() 메서드(넌다이렉터 버퍼 생성) 각 데이터 타입별 넌다이렉트 버퍼 생성 매개값 - 해당 데이터 타입의 저장 개수 : 여기서는 10개임.
		ByteBuffer byteBuffer = ByteBuffer.allocate(100);
		
		Charset charset = Charset.defaultCharset();
		String data = "";
		int byteCount;
		
		while (true) {
			byteCount = fileChannel.read(byteBuffer);
			// 파일에서 읽혀지는 바이트는 ByteBuffer의 position부터 저장 버퍼에
			// 한 바이트를 저장할 때마다 position이 1씩 증가함. 버퍼에 저장한 마지막
			// 바이트의 위치는 position-1 인덱스까지 한 번 읽을 수 있는 최대 바이트 수는
			// position부터 ByteBuffer의 capacity까지임.
			if (byteCount == -1) { // byteCount가 끝까지(없을때) -1이면 break;문 처리함
				break;
			}
			byteBuffer.flip();
			// flip() 메서드는 버퍼에서 저장된 position을 0으로 설정하고
			// limit를 현재 버퍼에 저장된 내용의 마지막 위치로 이동 처리합니다.
			
			data += charset.decode(byteBuffer).toString();
			byteBuffer.clear(); // byteBuffer 저장값 clear() 메서드로 비워줌.
		}
		fileChannel.close(); // file채널 클로징(닫기) 처리
		
		System.out.println("nio.txt : " + data);
	}
}
