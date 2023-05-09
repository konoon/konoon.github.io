package source15.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로 점수를 값으로 저장하는 HashMap 활용 예시

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("장나라", 85);
		map.put("김희선", 90);
		map.put("이영애", 92);
		map.put("장나라", 88);
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기: 이름(키)으로 점수(값)을 선택
		System.out.println(map.get("장나라"));
		System.out.println("==============");
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // Key Set 열기
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("==============");
		
		// 객체 삭제
		map.remove("장나라");
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		
		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}

}
