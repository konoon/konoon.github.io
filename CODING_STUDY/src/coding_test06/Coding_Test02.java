package coding_test06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 키보드로 아이디와 비밀번호를 입력 받아서,
// Hashtable에 저장 되어 있는 키(아이디)와 값(비밀번호)을
// 비교한 후 로그인 여부를 다음의 결과 내용과 같이 출력하는
// 자바 프로그램을 제작해 봅니다.
// 결과 내용
// 아이디와 비밀번호를 입력해주세요
// 아이디: spring
// 비밀번호: 11

// 비밀번호가 일치하지 않습니다.
// 아이디와 비밀번호를 입력해주세요
// 아이디: spring
// 비밀번호: 12

// 로그인 되었습니다

public class Coding_Test02{
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("spring", "12");
		map.put("summer", "112");
		map.put("fall", "121");
		map.put("winter", "112");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다!");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지않습니다.");
			}
		}
	}
}
