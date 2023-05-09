package source18_streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test05_AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		
		int [] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray); // 스트림 생성
		 // 중간 처리 intStream.asDoubleStream() 메소드로 int형의 1~5를 double형으로 중간 변환 처리 
		intStream.asDoubleStream()
		.forEach(d -> System.out.println(d));
		
		System.out.println("===============================");
		
		intStream = Arrays.stream(intArray);
		 // 중간 처리로 intStream.boxed()로 int형의 1~5를 Integer 객체형으로 박싱 처리해서 stream 생성하며,
		intStream.boxed()
		// intValue() 메서드는 Integer 객체에서 int형 값을 기져오는 메소드임
		.forEach(obj -> System.out.println(obj.intValue()));
	}

}
