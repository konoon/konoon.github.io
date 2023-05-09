package source15.collection;

import java.util.HashSet;

public class Test05_01_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs01 = new HashSet<String>();
		HashSet<String> hs02 = new HashSet<String>();
		
		// add() a메서드를 이용한 요소의 저장
		hs01.add("장나라");
		hs01.add("김희선");
		
		System.out.println(hs01.add("김다미"));
		System.out.println(hs01.add("김다미")); // 중복된 요소의 저장은 false 나옴
		
		System.out.println("=================");
		
		for (String string : hs01) {
			System.out.println(string + " ");
		}
		
		System.out.println("=================");
		
		hs02.add("남주혁");
		hs02.add("전지현");
		hs02.add("이영자");
		
		for (String string : hs02) {
			System.out.println(string + " ");
		}
		
		System.out.println("\n 집합의 크기: " + hs02.size());
	}

}
