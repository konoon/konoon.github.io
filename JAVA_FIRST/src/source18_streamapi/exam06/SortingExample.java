package source18_streamapi.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// 정렬: 스트림은 요소가 최종 처리되기 전에 중간 단계에서 요소를 정렬 처리함

public class SortingExample {
	public static void main(String[] args) {
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 1, 2, 4});
		intStream.sorted().forEach(n -> System.out.print(n + ""));
		System.out.println();
		
		List<Student> studentList = Arrays.asList(new Student("장나라", 30), new Student("장나라", 45), new Student("장나라", 10));
		
		studentList.stream().sorted().forEach(s -> System.out.print(s.getScore() + " "));
		System.out.println();
		
		studentList.stream().sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.print(s.getScore() + " "));
	}

}
