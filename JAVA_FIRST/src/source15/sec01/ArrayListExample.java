package source15.sec01;

import java.util.ArrayList;
import java.util.List;

// String 객체를 저장하는 ArrayList

public class ArrayListExample {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "JDBC";
		String str3 = "Servlet/JSP";
		
//		String str [] = {"Java", "JDBC", "Servlet/JSP"};
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
//		System.out.println(list.add("Java"));
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // -> 숫자 2는 인덱스 2번이라고 표현한 것
		list.add("Mybatis");
		list.add("JPA");
		
		int size = list.size(); // 저장된 총 객체 수 얻기
		System.out.println("저장된 총 객체 수 = " + size + "개 입니다.");
		System.out.println("======================");
		
		String skill1 = list.get(2);
		System.out.println("index 2에는 " + skill1 + " 문자열이 있습니다.");
		String skill2 = list.get(3);
		System.out.println("index 3에는 " + skill2 + " 문자열이 있습니다.");
		System.out.println("======================");
		
		// 저장된 총 객체 수 만큼 반복해서 값을 읽어옴
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("인덱스 " + i + " : " + str);
		}
		System.out.println("======================");
		
		list.remove(2); // 2번 인덱스 객체를 삭제 처리함
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("인덱스 " + i + " : " + str);
		}
		System.out.println("======================");
		
		list.remove(2); // 2번 인덱스 객체를 삭제 처리함
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("인덱스 " + i + " : " + str);
		}
		System.out.println("======================");
		
		list.remove("Mybatis"); 
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("인덱스 " + i + " : " + str);
		}
		System.out.println("======================");
	}
}
