package source18_streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test01_IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("김희선", "장나라", "이영애");
		
		// Iterator 순환 반복자 이용
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
		
		System.out.println("===================");
		
		// Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(sname -> System.out.println(sname));
	}

}
