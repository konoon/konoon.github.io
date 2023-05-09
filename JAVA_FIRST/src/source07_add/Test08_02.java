package source07_add;

import java.util.Scanner;

// 아이디를 입력 받아서 지정된 아이디와 일치하면 로그인 성공 메세지가 나타나도록 프로그램 제작
public class Test08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String id [] = {"a123", "b567", "c007", "test"};
		System.out.print("아이디를 입력해 주세요. ==> ");
		String userId = scan.next();
		String logInfo = "";
		int logTF = 0; // 로그인값의 진위 여부를 판별하기 위한 체크 변수 lodTF 선언
		
		for(int i = 0; i < id.length; i++) {
			if(userId.equals(id[i])) {
				// 입력한 ID값이 같으면 해당 값을 출력용 변수 logTF에 대입함
				logInfo = id[i];
				// 입력한 ID가 로그인 값과 일치한다면 체크 변수 logTF값을 1증가시킴
				logTF++;
			}
		}
		if(logTF > 0) {
			System.out.println(logInfo + "님의 환영합니다");
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		scan.close();
	}

}
