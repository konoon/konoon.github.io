package source16.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

// 버퍼의 위치 속성 이해를 위한 쓰기 모드 예시

public class Test04_ByteBuffer {
	public static void main(String[] args) {

		System.out.println("[7바이트 크기로 버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocate(7);
		printSate(buffer); // 사용자 정의 printState() 메서드 활용
		
		buffer.put((byte) 10);
		buffer.put((byte) 11);
		System.out.println("[2바이트 저장 후]");
		printSate(buffer);
		
		buffer.put((byte) 12);
		buffer.put((byte) 13);
		buffer.put((byte) 14);
		System.out.println("[3바이트 저장 후]");
		printSate(buffer);
		
		buffer.mark(); // 현재 position의 위치를 기억시키기 위해 mark() 메서드 호출
		System.out.println("==========[현재 위치를 마크해 놓음]");
		
		buffer.clear(); // 버퍼 위치 속성을 초기화 하기 위해 clear() 메서드 호출
		System.out.println("[clear() 실행 후]");
		printSate(buffer);
	}

	public static void printSate(Buffer buffer) {
		System.out.print("\t position : " + buffer.position() + ", ");
		System.out.println("\t limit : " + buffer.limit() + ", ");
		System.out.println("\t capacity : " + buffer.capacity());
	}
}
