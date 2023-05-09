package source18_streamapi;

import java.util.Arrays;

// 루핑:  요소 전체를 반복처리하는것
// peek() 중간 처리 메서드
// 중간처리 단계에서 전체 요소를 루핑하며 추가 작업하기 위해 사용함.

public class Test06_LoopingExample {
	public static void main(String[] args) {
		int [] intArray = {1, 2, 3, 4, 5};
		
		System.out.println("[peek() 메서드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArray)
			.filter(a -> a % 2 == 0)
			 .peek(n -> System.out.println(n))
			.sum();
		System.out.println("2의 배수값들의 총합 = " + total);

		System.out.println("[forEach() 메서드를 마지막에 호출한 경우]");
		Arrays.stream(intArray)
		.filter(a -> a % 2 == 0)
		// forEach() 메서드는 최종 처리(연산) 메서드이며, 파이프라인 마지막에 루핑하며 요소를 하나씩 처리함
		.forEach(n -> System.out.println(n));
		
	}

}
