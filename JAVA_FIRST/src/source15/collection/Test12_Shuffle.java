package source15.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test12_Shuffle {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		
		for (char c = 'A'; c <= 'G'; c++) {
			list.add(c);
		}
		System.out.println("섞기 전: \t" + list);
		System.out.println(list.get(1));
		Collections.shuffle(list);
		System.out.println("섞기 후: \t" + list);
	}
}
