package source07_add;

import java.util.Stack;

public class Test02_02 {

	public static void main(String[] args) {
		// 배열의 선언과 생성, 크기 계산
//		String data [] = {"하나", "둘", "셋", "넷", "다섯"}; 첫번째 생성방법
//		String data [] = new String[]{"하나", "둘", "셋", "넷", "다섯"}; 두번째 생성방법
		// 세번째 방법
		String data[];
		data = new String[]{"하나", "둘", "셋", "넷", "다섯"};
		
		// 네번째 방법
		String str[] = new String[3];
		str[0] = "하나";
		str[1] = "둘";
		str[2] = "셋";
		
		System.out.println(str[2]);
		
		int count;
		count = data.length;
		System.out.printf("배열 data[]의 요소 개수는 %d개 입니다.\n",count);
	}

}
