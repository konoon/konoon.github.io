package source13.java_api;

import java.util.Arrays;

// java.util.Arrays 클래스 : 배열을 다루기 위한 다양한 메서드가 포함되어 있습니다.
// Arrays 클래스의 모든 메소드는 static 메서드 이므로, 객체 생성 없이 클래스로 바로 사용이 가능

public class Test05_Arrays {
	public static void main(String[] args) {
		char[] a1 = {'J', 'a', 'v', 'a'};
		
		char[] a2 = Arrays.copyOf(a1, a1.length);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("===========");
		
		String [] sa = {"cake", "apple", "banana"};
		Print(sa);
		System.out.println("===============");
		
		System.out.println(Arrays.binarySearch(sa, "banana")); //2
		System.out.println("==========");
		
		// Arrays 클래스의 fill() 메서드를 활용해서 sa 배열안에 index(1)부터 index(3) 미만까지 "장나라"로 채워줌
		Arrays.fill(sa, 1, 2, "장나라");
		Print(sa);
	}

	public static void Print(String[] sa) {
		for (String o : sa) {
			System.out.println(o + " ");
		}
	}

}
