package source15.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test14_01_Stream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> gt = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for (int i = 0; i < 20; i++) {
			list.add(r.nextInt(30));
//			System.out.println(list);
		}
		
		for (int i : list) {
			if(i > 10) {
				gt.add(i);
			}
//			System.out.println(gt);
		}
		
		System.out.println(gt);
		
		list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
	}

}
