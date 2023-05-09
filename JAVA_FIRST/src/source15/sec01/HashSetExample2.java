package source15.sec01;

import java.util.HashSet;
import java.util.Set;

// Member 객체를 중복 없이 저장하는 HashSet예시

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("장나라", 30));
		set.add(new Member("장나라", 30));
		
		System.out.println("총 객체 수 " + set.size()); // 저장된 객체 수 얻기
	}

}
