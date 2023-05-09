package source15.collection;

import java.util.Iterator;
import java.util.TreeMap;

// TreeMap<K, V> 클래스
// TreeMap 클래스는 키와 값을 한 쌍으로 데이터를 이진 검색 트리의 형태로 저장. 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르고 JDK1.2 부터 제공된 TreeMap클래스는 인터페이스를 기존의 이전 검색 트리의 성능을 향상시킨 레드-블랙 트리로 구현 TreeMap 클래스는 Map인터페이스를 구현하므로 중복된 키로는 값 저장 ㄴㄴ 같은값을 다른 키로 저장하는건 가능

public class Test11_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// put() 메서드를 활용한 요소의 저장 처리
		tm.put(30, "삼십");
		tm.put(10, "십");
		tm.put(40, "사십");
		tm.put(20, "이십");
		
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());
		System.out.println("=================================");
		// Enhanced for문과 get() 메서드를 활용한 요소의 출력
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, tm.get(key)));
		}
		System.out.println("=================================");
		tm.remove(40);
		
		// Iterator() 메서드와 get() 메서드를 활용한 요소 출력
		Iterator<Integer> keys = tm.keySet().iterator();
		while (keys.hasNext()) {
			Integer key = (Integer) keys.next();
			System.out.println(String.format("키: %s, 값: %s", key, tm.get(key)));
		}
		System.out.println("=================================");
		tm.replace(20, "twenty");
		for (Integer key : tm.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, tm.get(key)));
		}
		System.out.println("=================================");
		// size() 메서드를 이용한 요소의 총 개수
		System.out.println("맵의 크기 = " + tm.size());
	}

}
