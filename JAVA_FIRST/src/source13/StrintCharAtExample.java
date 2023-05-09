package source13;

public class StrintCharAtExample {

	public static void main(String[] args) {
		String ssn = "202056-2345678";
		char gender = ssn.charAt(7);
		
		switch (gender) {
		case '1':
			System.out.println("남성입니다.");
			break;
		case '2':
			System.out.println("여성입니다.");
			break;
			
		default:
			break;
		}

	}

}
