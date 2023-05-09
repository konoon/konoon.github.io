package source15.generic;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("봄"));
		list.add(new String("여름"));
		list.add(new String("가을"));
		list.add(new String("겨울"));
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("===============");
		
		ArrayList<Integer> itg = new ArrayList<Integer>();
		itg.add(new Integer(100));
		itg.add(new Integer(200));
		itg.add(new Integer(300));
		itg.add(new Integer(400));
		
		for (Integer integer : itg) {
			System.out.println(integer);
		}
	}

}
