package source10_abstract;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메서드(형식이 정해져있지않은 메서드) -> abstract를 붙이면 추상메서드로 인식하고 오류안남
}
