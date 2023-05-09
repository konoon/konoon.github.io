package source07_add;

import java.util.ArrayList;

public class Test07_01 {

	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		
		test.add("장나라");
		test.add("김유신");
		test.add("이순신");

		System.out.println(test);
		System.out.println(test.get(1));
		System.out.println(test.size());
		
		test.remove(1);
		System.out.println(test);
		
		if(test.add("김희선")) {
			System.out.println("김희선이 추가 되었습니다.");
		}
		System.out.println(test);
	}

}
