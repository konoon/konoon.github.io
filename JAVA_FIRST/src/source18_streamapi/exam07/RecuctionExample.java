package source18_streamapi.exam07;

import java.util.Arrays;
import java.util.List;

// 집계: 대량의 데이터를 가공해서 축소 처리하는 리덕션 집계 처리가 있음. 커스텀 집계를 위한 기본 집계 메서드로 reduce() 메서드가 제공됨
// 집계 데이터를 프로그램화해서 다양한 집계 결과물을 만들 수 있도록 제공함

public class RecuctionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("장나라", 92), new Student("김희선", 88), new Student("전지현", 92));
		
		int sum1 = studentList.stream() // 스트림 생성
				// Student객체의 getScore 메서드 값을 int 형으로 매핑 중간 처리함
				// 메서드 참조(ClassName::메서드)
				.mapToInt(Student::getScore)
				.sum();
		System.out.println("sum1 = " + sum1);
		
		
		int sum2 = studentList.stream() // 스트림 생성
				// Student객체의 getScore 메서드 값을 int 형으로 매핑 중간 처리함
				.map(Student::getScore)
				.reduce((a, b) -> a - b).get();
		System.out.println("sum2 = " + sum2);
	}
}
