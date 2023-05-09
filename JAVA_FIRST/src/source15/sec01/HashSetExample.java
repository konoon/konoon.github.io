package source15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String 객체를 중복 없이 저장하는 HashSet 활용 예시

public class HashSetExample {
	public static void main(String[] args) {
		
		String str = new String("Java");
		
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 데이터 입력 허용 안함
		set.add("Mybatis");
		
		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iterator = set.iterator(); // 반복자 활용 데이터 얻기
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		iterator = set.iterator(); // 반복자 활용 데이터 얻기
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체를 제거하고 비워줌
		size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		if(set.isEmpty()) {
			System.out.println("객체가 존재하지않습니다.");
		} else {
			System.out.println("객체가 존재합니다.");
		}
	}

}
