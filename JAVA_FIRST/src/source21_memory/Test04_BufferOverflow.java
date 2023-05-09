package source21_memory;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Test04_BufferOverflow {

	public static void main(String[] args) {
		System.out.println("[7바이트 크기로 byte 버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);
		printState(buffer);
		
		buffer.put((byte) 10);
		buffer.put((byte) 11);
		System.out.println("[2바이트 저장 후 position위치]");
		printState(buffer);
		
		buffer.put((byte) 12);
		buffer.put((byte) 13);
		System.out.println("[3바이트 저장 후 position위치]");
		printState(buffer);
		
		// JVM 힙 메모리의 버퍼 메모리 활용 capacity: 7, limit: 7, position: 0
		System.out.println("[7바이트 크기로 char 버퍼 생성]");
		CharBuffer cb = CharBuffer.allocate(7);
		System.out.println("capacity: " + cb.capacity());
		System.out.println("limit: " + cb.limit());
		System.out.println("position: " + cb.position());
		
		cb.put("Hello"); // 공백과 특수문자 포함: 7문자 이내 입력으로 안하면 BufferOverflow라고 예외 상황 발생(오류)
//		cb.put("Hello~ Jangnara");
		System.out.println("position: " + cb.position());
		
		cb.clear(); // CharBuffer 저장값 clear()로 비워줌
	}

	// 위에 printState(buffer) 메서드 선언
	public static void printState(ByteBuffer buffer) {
		System.out.print("\t position: " + buffer.position() + ", ");
		System.out.print("\t limit: " + buffer.limit() + ", ");
		System.out.print("\t capacity: " + buffer.capacity() + "\n");
	}
}
