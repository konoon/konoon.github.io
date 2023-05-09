package source08_constructor;

public class Korean {
	// 필드 생성
	String nation = "대한민국"; // 필드 생성 후 초기화
	String name;
	String ssn;
	
	// 생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
