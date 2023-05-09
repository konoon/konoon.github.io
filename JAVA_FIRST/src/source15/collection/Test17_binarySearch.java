package source15.collection;

import java.util.Arrays;

public class Test17_binarySearch {
	public static void main(String[] args) {
		int arr1 [] = {1, 5, 3, 2, 4};
		// Arrays.sort() 이용해서 arr1 정렬 처리함
		// 탐색 이전에 정렬이 선행 되어야 함
		Arrays.sort(arr1);
		
		// 향상된 for~each 문을 통해서 arr1 요소 5개만큼 반복 수행함
		for (int i : arr1) {
			System.out.print(i + " "); // 1 2 3 4 5
		}
		
		System.out.println(""); // 구분 영역
		
		// Arrays.binarySearch() 활용해서 arr1 배열 요소 5의 정렬 위치 4를 찾아냄
		int idx = Arrays.binarySearch(arr1, 5); // 4
		System.out.println("index of 5: " + idx);
	}

}
