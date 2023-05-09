package source15.sec01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 키보드 아이디(String)와 비밀번호(String)를 입력 받아서 Hashtable에 저장되어 있는 키(아이디)와 값(비밀번호)을
// 비교한 후 로그인 여부를 출력하는 예시

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		// 아이디와 비밀번호를 미리 저장 처리함
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[아이디와 비밀번호를 입력해 주시기 바랍니다.] ==> ");
			System.out.println("아이디를 입력해 주시기 바랍니다.");
			String id = scan.nextLine();
			System.out.println("비밀번호를 입력해 주시기 바랍니다.");
			String password = scan.nextLine();
			System.out.println("=====================");
			
			// 아이디와 키가 존재하는지 확인
			if(map.containsKey(id)) {
				// 비밀번호를 비교 확인
				if(map.get(id).equals(password)) {
					System.out.println(map.get(id));
					System.out.println("아이디 = " + id + ", 비밀번호 = " + password);
					System.out.println("로그인이 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
	}

}
