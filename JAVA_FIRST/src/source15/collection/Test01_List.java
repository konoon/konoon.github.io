package source15.collection;

import java.util.Arrays;
import java.util.List;

public class Test01_List {

	public static void main(String[] args) {
		// 배열 변수 선언 및 초기화
		String [] names = {"사슴", "호랑이", "바다표범", "호랑이",};
		
		// 배열 타입 변수 값들을 List 타입으로 적용함
		List<String> list = Arrays.asList(names);
		
		for (String string : list) {
			System.out.print(string + " ");
		}
	}

}
