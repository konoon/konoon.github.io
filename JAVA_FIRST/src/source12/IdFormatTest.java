package source12;

import java.util.Scanner;

public class IdFormatTest {
	private String userID;

	public String getUserID() {
		return userID;
	}

	// 아이디가 null값이거나 지정 범위 (8자 이상 20자 이하)를 벗어나는 경우에 대한 제약 조건 구현함
	// 아이디에 대한 제약 조건 구현 : throws로 예외를 미루어 처리함. 즉 IdFormatException 예외를 setUSerID()메서드가 호출될 때 미루어 처리하도록 함
	public void setUserID(String userID) throws IdFormatException {
		if(userID == null) {
			throw new IdFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IdFormatException("아이디는 8자 이상 20자 이하로 써 주시기 바랍니다.");
		}
		
		this.userID = userID;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하기==>");
		String Id = scan.nextLine();
		
		IdFormatTest test = new IdFormatTest();
		
		// 아이디가 null, 아이디값이 8자리미만 20초과일때는 예외발생
		String userID = Id;
		try {
			test.setUserID(userID);
			System.out.println(userID + "님 접속을 환영합니다.");
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
