package source15.collection;

import java.util.HashMap;
import java.util.Iterator;

// HashMap<K, V> 클래스
// HashMap 클래스는 Map 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나입니다. JDK1.2부터 제공된 HashMap 클래스는 해시 알고리즘을 사용하여 검색 속도가 매우 빠릅니다. HashMap 클래스는 Map 인터페이스를 구현하므로, 중복된 키로는 값을 저장할 수 없습니다. 하지만 같은 값을 다른 키로 저장하는 것은 가능합니다.

public class Test09_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// put() 메서드를 이용한 요소의 저장
		hm.put("삼십", 30);
		hm.put("십", 10);
		hm.put("사십", 40);
		hm.put("이십", 20);
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		System.out.println("=============================");
		for (String key : hm.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
		}
		System.out.println("============================");
		
		hm.remove("사십");
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
		}
		System.out.println("============================");
		
		hm.replace("이십", 200);
		for (String key : hm.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
		}
		System.out.println("============================");
		
		// 요소의 총 개수 확인
		System.out.println("맵의 크기 = " + hm.size());
	}

}
