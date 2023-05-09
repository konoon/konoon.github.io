package source10_abstract;

// 추상 클래스로 만들기 위해 abstract 추가

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("핸드폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("핸드폰 전원을 끕니다.");
	}
}
