package source18_streamapi.exam04;

import java.util.Arrays;
import java.util.List;

// 중간 처리와 최종 처리
// Stream 인터페이스는 필터링, 매핑, 정렬 등의 많은 중간 처리 메소드를 가짐 메서드들은 중간 처리된 스트림을 리턴

public class StreamPipeLinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("장나라", Member.FMALE, 30), new Member("김희선", Member.FMALE, 45), new Member("김국진", Member.MALE, 45), new Member("김다미", Member.FMALE, 30));
		
		double ageAvg = list.stream() // 스트림 생성
				.filter(m -> m.getGender() == Member.FMALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("여성 회원들의 평균 나이 = " + ageAvg);
	}

}
