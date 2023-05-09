package source07_add;

import java.util.ArrayList;

public class Test07 {

	public static void main(String[] args) {
		ArrayList<String> value = new ArrayList<String>();
		System.out.println("초기 배열 크기 = " + value.size());
		
		value.add("A");
		value.add("B");
		value.add("C");
		value.add("D");
		value.add(1, "장나라"); // index 1번에  '장나라'를 추가 하는 것 
		
		System.out.println("ArrayList 클래스의 add() 메서드 사용 후 배열 크기 = " + value.size());
		System.out.println(value);
		
		System.out.println("value.get(0) 실행 후 값 = " + value.get(1));
		
		value.remove(3);
		System.out.println("value.remove(3) 실행 후 값 = " + value);
		
		// ArrayList boolean add (E e)에서 boolean은 리턴 타입을 의미함
		if(value.add("Z")) {
			System.out.println("Z값 있음");
		}
		System.out.println(value);
	}

}
