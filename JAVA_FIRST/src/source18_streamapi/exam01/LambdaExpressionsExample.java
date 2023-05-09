package source18_streamapi.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("김희선", 90), new Student("장나라", 92));
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " - " + score);
		});
	}
}

/* 결과 화면
김희선 - 90
장나라 - 92
*/
