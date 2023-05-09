package source13.java_api;

import java.util.Random;

// Math클래스에 있는게 아닌 java.util 패키지에 있는 Random사용

public class Test08_Random {

	public static void main(String[] args) {
		
		// Random 객체 생성
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.print(rd.nextInt(100) + " ");
			// int nextInt() : int 타입의 난수를 발생시킴
			// int nextInt(int bound) : 0~n 사이의 int 타입의 난수를 발생시킴
			// 여기서는 0~100사이의 int타입 난수를 발생시키고 그중에서 for문으로 설정한 5개까지만 화면으로 출력함 
		}
	}

}
