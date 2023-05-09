package source18_streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Review_IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("김다미", "김연아", "최민정");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
		System.out.println("========================");
		
		Stream<String> stream = list.stream();
		stream.forEach(sname -> System.out.println(sname));
	}

}
