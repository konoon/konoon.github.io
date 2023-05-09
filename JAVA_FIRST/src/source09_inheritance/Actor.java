package source09_inheritance;

public class Actor extends Person {
	private String movie;
	
	public Actor() {
		System.out.println("배우 생성자를 만들었습니다.");
	}

	public Actor(String movie) {
		this.movie = movie;
	}

	@Override
	public void setInfo(String name, String sid) {
		super.setInfo(name, sid);
		System.out.println("이름은 " + name + " 주민등록번호는 " + sid + " 출현 영화는 " + movie);
	}
	
}
