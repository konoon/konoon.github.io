package source11.review.exam03;

class Ticon {
	int n = 10;
	
	interface Touchable {
		void touch();
	}
	
	public Ticon() {
		System.out.println("★ 외부 클래스 Ticon 생성자");
	}
}

public class InnerInterfaceDemo implements Ticon.Touchable {
	public InnerInterfaceDemo() {
		System.out.println("＠ InnerInterfaceDemo 생성자 체크");
	}
	
	public static void main(String[] args) {
		System.out.println("★ 어플 시작");
		Ticon.Touchable btn = new InnerInterfaceDemo();
		btn.touch();
		
		Ticon c = new Ticon();
		int k = c.n;
		System.out.println(k);
	}

	@Override
	public void touch() {
		System.out.println("아이콘을 터치합니다.");
	}
}
