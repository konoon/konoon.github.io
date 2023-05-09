package source15.sec01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "장나라"), 95);
		map.put(new Student(1, "장나라"), 95);
		
		System.out.println("총 Entry 수  : " + map.size());
	}

}
