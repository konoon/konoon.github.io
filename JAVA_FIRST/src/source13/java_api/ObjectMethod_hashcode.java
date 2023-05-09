package source13.java_api;

import java.util.HashMap;
import java.util.LinkedHashMap;

// Object 클래스의 hashcode() 메서드 활용 예시

class A {
	String name;

	public A(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 만약 이 네임이 A오브젝트에 있는 네임과 같다면
		if(this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
}

public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		// HashMap은 입력된 순서에 상관없이 데이터가 표현됨 즉, HashMap은 데이터의 순서가 보장되지않음
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(3, "데이터3");
		System.out.println(hm1);
		
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("1"), "데이터1");
		hm2.put(new A("2"), "데이터2");
		hm2.put(new A("3"), "데이터3");
		System.out.println(hm2);
		
		// HashMap의 순서를 보장하고 싶은 경우에는 LinkedHashMap을 활용합니다.
		HashMap<A, String> hm3 = new LinkedHashMap<>();
		hm3.put(new A("1"), "데이터1");
		hm3.put(new A("2"), "데이터2");
		hm3.put(new A("3"), "데이터3");
		System.out.println(hm3);
	}
}
