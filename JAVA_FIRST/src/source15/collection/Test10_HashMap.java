package source15.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test10_HashMap {
	public static void main(String[] args) {
		Map<String, String> pp = new HashMap<String, String>();
		
		pp.put("KEY1", "VALUE1");
		pp.put("KEY2", "VALUE2");
		pp.put("KEY3", "VALUE3");
		pp.put("KEY4", "VALUE4");
		pp.put("KEY5", "VALUE5");
		
		for (String string : pp.keySet()) {
			System.out.println(string + ", " + pp.get(string));
		}
		System.out.println("===========================");
		// 다음의 예문과 같이 iterator() 메서드와 keySet() 메서드를 이용한 요소 출력의 경우, Map에 값을 전체 출력하기 위해서는 entrySet(), keySet() 메서드를 사용하면 되는데 entrySet()메서드는 key와 value의 값이 모두 필요한 경우 사용하고, keySet()메서드는 key의 값만 필요한 경우 사용. 즉 iterator 인터페이스를 사용할 수 없는 컬렉션인 Map에서 iterator 인터페이스를 사용하기위해서는 Map에 entrySet(), keySet() 메서드를 사용하여 Set 객체를 반환 받은 후 iterator 인터페이스를 사용하시면 됩니다.
		
		Iterator<String> it = pp.keySet().iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + ", " + pp.get(string));
		}
		System.out.println("===========================");
		
		Iterator<Map.Entry<String, String>> it2 = pp.entrySet().iterator();
		
		while (it2.hasNext()) {
			Map.Entry<String, String> entry = it2.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println("======================");
		// 람다식 사용: 컬렉션이 구현하는 forEach문 활용
		pp.forEach((string, value) -> System.out.println(string + ", " + value));
		
		// Stream API 사용
		pp.entrySet().stream().forEach(entry->{
			System.out.println("[key] " + entry.getKey() + " [value] " + entry.getValue());
		});
		
		System.out.println("======================");
		// Stream API 사용 - 내림차순
		
	}

}
