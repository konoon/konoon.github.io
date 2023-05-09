package source18_streamapi.exam03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("김희선", 10), new Student("장나라", 20), new Student("김다미", 30));
		
		Stream<Student> stream = studentList.stream(); // 스트림 생성
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
/* 실행 결과
김희선
장나라
김다미
*/