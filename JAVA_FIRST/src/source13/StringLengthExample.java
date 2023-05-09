package source13;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "202012-2345125";
		int length = ssn.length();
		System.out.println("주민등록번호 ssn의 자릿수는 " + length + "개 입니다.");

		if(length == 14) {
			System.out.println("-을 포함한 주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("-을 포함한 주민번호 자리수가 틀립니다.");
		}
	}

}
