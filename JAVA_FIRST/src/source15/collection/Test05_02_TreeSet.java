package source15.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

// TreeSet<E> 클래스: TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장합니다. TreeSet 클래스는 Set 인터페이스를 구현하므로, 요소를 순서에 상관없이 저장하고 중복된 값은 저장하지 않습니다. 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠릅니다. 다음 예제는 여러 TreeSet 메서드를 이용하여 집합을 생성하고 조작하는 자바 프로그램 예시입니다. 참고로 TreeSet 인스턴스에 저장되는 요소들은 모두 정렬된 상태로 저장 됩니다.

public class Test05_02_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		
		for (Integer integer : ts) {
			System.out.println(integer + " ");
		}
		
		System.out.println("=================");
		
		ts.remove(40);
		
		
		Iterator<Integer> iter = ts.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		
		System.out.println("=================");
		System.out.println("이진 검색 트리의 크기 : " + ts.size());
		
	}

}
