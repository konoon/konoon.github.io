package source13.string_review;

import java.util.Scanner;

// 문자열을 바꿔주는 replace(), 일부 문자열을 추출하는 substring(), 문자열을 분리하는 split()

public class Test05_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 입력받을 원본 문자열(strOrigin), 대체할 문자열(strRep), 일부 추출 문자열(strSub), 분리한 문자열 배열(strArray)을 선언
		String strOrigin, strRep, strSub, strArray[];
		System.out.print("8자 이상 문자열을 입력해 주시기 바랍니다. ==> ");
		strOrigin = s.nextLine();
		
		// 원본 문자열(strOrigin) : Have a Nice Day!
		System.out.println("입력한 원본 문자열 = " + strOrigin);
		System.out.println("입력한 원본 문자열의 길이 = "+ strOrigin.length());
		
		// 입력 원본 문자열(공백)을 $로 대체
		strRep = strOrigin.replace(" ", "$");
		System.out.println("공백을 $문자로 대체 표현한 문자열 표현 = " + strRep);
		
		// 입력 원본 문자열을 3번째 부터 8번째 인덱스 미만까지 문자열 추출
		strSub = strOrigin.substring(3, 8);
		System.out.println("일부 추출 문자열 표현 = " + strSub);
		
		// 입력 원본 문자열을 공백으로 분리
		strArray = strOrigin.split(" ");
		// 앞서 공백으로 분리한 입력 문자열을 분리한 문자열 배열 strArray에 하나씩 표현
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("분리한 문자열 " + i + " = " + strArray[i]);
		}
	}

}
