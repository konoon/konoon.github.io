package source15.collection;

import java.util.HashMap;
import java.util.Map;

public class Test07_HashMap {

	public static void main(String[] args) {
		// HashMap 구조 (key, value) : hash는 으깨다 라는 뜻으로 Hash는 hash table을 이용하여 데이터를 저장 처리하고 출력엔 순서가없음
		Map<String, Integer> m = new HashMap<>();
		m.put("apple", 3);
		m.put("banana", 5);
		m.put("grape", 10);
		m.put("strawberry", 1);
		
		System.out.println(m.size() + "종류의 과일이 있습니다.");
		
		// Set<k> keySet(): Map에 포함된 key를 Set타입으로 저장함
		for (String key : m.keySet()) {
			// HashTable에서 순서 없이 출력됨
			System.out.println(key + "가 " + m.get(key) + "개 있습니다.");
		}
		
		System.out.println("==================");
		String key = "banana"; // 바나나만 추출
		if (m.containsKey(key)) {
			System.out.println(key + "가 " + m.get(key) + "개 있습니다.");
		}
		
		m.remove("apple");
		System.out.println("사과를 없앤 후 과일의 종류는 " + m.size() + "개 입니다.");
		
		m.clear();
		System.out.println("모두 없앤 후 과일은 " + m.size() + "종류 입니다.");
	}

}
