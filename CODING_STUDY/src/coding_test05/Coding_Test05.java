package coding_test05;

import java.util.Scanner;

// 배열을 활용하여, 아이디를 입력 받아서
// 지정된 아이디와 일치하면 다음 결과 내용과 같이
// 로그인 성공 메시지가 나타나도록 자바 프로그램을 제작해 봅니다.
// 결과 내용 
// 아이디를 입력해 주세요 ==> 장나라
// 장나라님 환영합니다.
// 아이디를 입력해 주세요 ==> 김희선
// 아이디가 존재하지 않습니다.

public class Coding_Test05{
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String id[] = {"장나라", "전지현", "김다미"};
		System.out.println("아이디를 입력해 주세요 ==> ");
		String userId = scan.next();
		String logInfo = "";
		 // 로그인값의 진위 여부를 판별하기 위한 체크 변수 logTF 정의
		int logTF = 0;
		for (int i = 0; i < id.length; i++) {
			if(userId.equals(id[i])) {
				// 입력한 id값이 같으면 해당 값을 출력용 변수 logInfo에 대입 처리함.
				logInfo = id[i];
				// 입력한 id가 로그인 값과 일치한다면 체크 변수 logTF값을 1증가 시켜줌.
				logTF++;
			}
		}
		if(logTF > 0) {
			// 로그인 성공 메시지 화면 출력
			System.out.println(logInfo + "님 환영합니다.");
		} else {
			// 로그인 실패 메시지 화면 출력
			System.out.println("아이디가 존재하지 않습니다.");
		} scan.close();
	}
}
