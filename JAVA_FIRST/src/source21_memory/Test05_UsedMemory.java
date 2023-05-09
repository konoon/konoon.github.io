package source21_memory;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// JVM 메모리 사용향 확인 (측정)

public class Test05_UsedMemory {
	public static void main(String[] args) {
		Charset charset = Charset.forName("UTF-8");
		
		// 문자열을 인코딩해서 bytebuffer로 바꿈
		String data = "안녕";
		ByteBuffer byteBuffer = charset.encode(data);
		
		// ByteBuffer 디코딩해서 문자열 처리
		data = charset.decode(byteBuffer).toString();
		System.out.println("문자열 복원(표현): " + data);
		
		// 다음의 float형의 remainder 변수 처리할 경우 사용 메모리(usedMemory) 용량은 1911056 byte 입니다.
//		float remainder = 25 % 2;
		// int형으로 처리하면 1871104 byte로 용량 줄어듬
		int remainder = 25 % 2;
		System.out.println("25 ÷ 2의 나머지는: " + remainder + "입니다.");
		
		// 자바 힙 메모리 사용량 확인 java.lang.Runtime 클래스는 개발자의 메모리 사용량 관련하여 메서드를 제공함
		
		Runtime.getRuntime().gc();
		// <garbage collection 초기화> JVM Heap 메모리 영역의 오브젝트 중 stack에서 도달 불가능한 오브젝트들은 가비지 컬렉션 대상이 됨. 메모리 비교 직전에 gc() 메서드를 사용해서 garbage collection을 실행하도록 하면, 보다 더 정확하게 메모리 소비량을 얻을 수 있음.
		// maxMemory: 현재 allocate된 메모리의 최대 사용 가능량을 리턴함
		// totalMemory: 현재 allocate된 메모리 사용량을 리턴함
		// freeMemory: 햔재 allocate된 메모리 중에서 사용 가능한 메모리 양을 리턴함
		// totalMemory - freeMemory = 현재 allocate된 메모리중 사용하고 있는 메모리 양 파악이 가능함.
		long maxMem = Runtime.getRuntime().maxMemory();
		// JVM이 현재 시스템에 요구 가능한 최대 메모리량(maxMemory), 이 값을 넘으면 OutOfmemory오류 발생
		System.out.println("maxMemory is = " + maxMem + " byte");
		
		// JVM이 현재 시스템에에서 얻어 쓰고 있는 totalMemory 메모리의 총량을 나타냄
		long totalMem = Runtime.getRuntime().totalMemory();
		System.out.println("totalMemory is = " + totalMem + " byte");
		
		// JVM이 현재 시스템에  청구하여 사용중인 최대 메모리(totalMemory) 중에서 사용가능한 메모리(freeMemory) 용량 나타냄
		long freeMem = Runtime.getRuntime().freeMemory();
		System.out.println("freeMemory" + freeMem + " byte");
		
		// JVM이 현재 시스템에 청구하여 사용중인 최대 메모리(usedMemory)를 나타냄
		long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("usedMemory is = " + usedMem + " byte");
		// OutOfmemory 오류가 나면 적절하게 메모리량 조절하기
	}
}
