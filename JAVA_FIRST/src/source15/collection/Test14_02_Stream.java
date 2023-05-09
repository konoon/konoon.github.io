package source15.collection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test14_02_Stream {

	public static void main(String[] args) {
		int [] ia = {1, 6, 3, 9, 5, 4, 2};
		
		// Arrays.stream() 메소드를 통해서 ia 요소들을 is에 IntStream(원시데이터형 int를 스크림으로 다를 수 있도록 해줌) 선언
		IntStream is = Arrays.stream(ia);
		
		int sum = is.filter(i -> i > 5).sum();
		// Arrays.stream() 컬렉션에서 스트림을 가져옴
		// is.filter(i -> i > 5)의 뜻은 5보다 큰 원소만 추출한다는 것
		// .sum() 메서드로 추출된 6, 9의 합을 연산 처리합니다.
		
		System.out.println("5보다 큰 원소의 총합 : " + sum);
	}

}
