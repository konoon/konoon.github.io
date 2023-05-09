package source15.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap 클래스 Key와 Value가 한쌍으로 저장되는 자료구조입니다. Key값은 중복될 수 없고, 검색할 때 용이한 자료 구조임

public class Test08_HashMap {
	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<>();
		
		// 추가는 put() 메서드 활용
		hashmap.put("장나라", "010-1234-5678");
		hashmap.put("김희선", "010-1255-5678");
		hashmap.put("이영애", "010-5634-5678");
		System.out.println(hashmap);
		
		// Value 값을 리턴하는 get() 메서드 활용
		System.out.println(hashmap.get("장나라"));
		System.out.println(hashmap.get("bts"));
		
		// Value 값을 대체(변경)하는 replace() 메서드 활용
		hashmap.replace("장나라", hashmap.get("장나라"), "010-3545-5574");
		System.out.println(hashmap);
		
		// put() 메서드로 덮어써서 Value 값을 대체(변경) 할 수도 있음
		hashmap.put("김희선", "010-8787-5545");
		System.out.println(hashmap.get("김희선"));
		
		// key값이 존재하는지 확인
		System.out.println(hashmap.containsKey("이영애"));
		
		// 삭제는 remove 메서드를 활용함
		hashmap.remove("이영애");
		System.out.println(hashmap);
		
		// 키셋
		System.out.println(hashmap.keySet());
		
		System.out.println("기본 출력 " + hashmap);
		
		System.out.println("=====================");
		
		// 출력1 향상된 for each 구문으로 화면 출력함
		System.out.println("[향상된 for each 구문으로 화면 출력함]");
		for (String key : hashmap.keySet()) {
			System.out.println(key + " : " + hashmap.get(key));
		}
		System.out.println("=====================");
		// 출력2 Iterator 순환 반복 선택자 활용 화면 출력함
		System.out.println("[Iterator 순환 반복 선택자 활용 화면 출력함]");
		Set<String> keySet = hashmap.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = hashmap.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("=====================");
		// 출력3 for문 Map.Entry 활용 화면 출력함
		System.out.println("[for문 Map.Entry 활용 화면 출력함]");
		for (Map.Entry<String, String> elem : hashmap.entrySet()) {
			String key = elem.getKey(); // element 요소의 key값 추출
			String value = elem.getValue(); // element 요소의 value값 추출
			System.out.println(key + " : " + value);
		}
	}
}
