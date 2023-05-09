package source09_inheritance;

public class Singer extends Person {
	
	private String music;
	private String agency;
	
	public Singer() {
		System.out.println("가수 생성자를 만들었습니다.");
	}

	public Singer(String music, String agency) {
		this.music = music;
		this.agency = agency;
	}

	@Override
	public void setInfo(String name, String sid) {
		super.setInfo(name, sid);
		System.out.println("이름은 " + name + " 주민번호는 " + sid + " 음악은  " + music + " 소속사는 " + agency);
	}

	@Override
	public void showInfo() {
		super.showInfo();
	}
	
}
