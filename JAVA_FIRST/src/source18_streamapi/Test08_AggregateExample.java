package source18_streamapi;

import java.util.Arrays;

// 집계(Aggregate): 최종 처리 기능으로 요소들을 처리해 카운팅, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출 처리하는것
// 대량의 데이터를 가공해서 축소 처리하는 리덕션 집계 처리도 있음

public class Test08_AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.count(); // count() 메서드 활용 숫자 카운트 집계 최종 처리
		System.out.println("2의 배수는 " + count + "개 입니다.");
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.sum(); // sum() 메서드 활용 2의 배수 총합 최종 처리
		System.out.println("2의 배수 총합은 " + sum + "입니다.");

		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.average().getAsDouble(); // 2의 배수 평균값을 최종 처리
		System.out.println("2의 배수 평균 = " + avg + "입니다.");

		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.max().getAsInt();
		System.out.println("2의 배수 중에서 최대값 = " + max + "입니다.");

		int maxFull = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.max().getAsInt();
		System.out.println("스트림 생성 값 중에서 최대값 = " + maxFull);

		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.min().getAsInt();
		System.out.println("2의 배수 중에서 최소값 = " + min + "입니다.");

		int minFull = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.min().getAsInt();
		System.out.println("스트림 생성 값 중에서 최소값 = " + minFull);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n % 3 == 0) 
				.findFirst().getAsInt();
		System.out.println("첫번째 3의 배수값 = " + first);
	}

}
