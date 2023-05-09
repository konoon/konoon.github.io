package source13;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그램";
		
		int location = subject.indexOf("자바");
		System.out.println(location);
		
		// -1 뜻은 끝까지 검색했을 때
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
	}

}
