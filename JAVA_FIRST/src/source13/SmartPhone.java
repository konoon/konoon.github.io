package source13;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	// object 클래스에 있는 toString() 메서드 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	}

}
