package source15.collection;

import java.util.Arrays;

public class Test15_ArraysCopyOf {

	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3, 4, 5};
		
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println("\n=============");
		
		// 위에 arr1 요소들 중에서 Arrays.copyOf() 메서드를 활용해서 4개 요소까지만 복사
		int [] arr2 = Arrays.copyOf(arr1, 4);
		
		for (int i : arr2) {
			// arr2에 복제된 요소만 출력됨
			System.out.print(i + " ");
		}
	}

}
