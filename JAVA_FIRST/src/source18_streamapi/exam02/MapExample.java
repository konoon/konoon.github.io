package source18_streamapi.exam02;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("김희선", 10), new Student("장나라", 20), new Student("이영애", 30));
		
		double avg = studentList.stream()  // stream() 스트림 생성
					// 중간처리(학생 객체를 점수로 매핑)
					.mapToInt(Student::getScore) 
					// 최종처리(평균 점수를 구해줌)
					.average().getAsDouble();
				System.out.println("평균 점수 = " + avg);
	}
}
/* 실행 결과
평균 점수 = 20.0
*/
