package source11.review.exam02;

public class LocalClassDemo {

	public LocalClassDemo() {
		System.out.println("※ LocalClassDemo 생성자");
	}
	
	void method() {
		class LocalClass {
			String s2 = "내부";
			
			public LocalClass() {
				System.out.println("★ LocalClass 생성자");
			}
			
			public void show() {
				System.out.println("지역 클래스 LocalClass show() 메서드");
			}
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}
	
	public static void main(String[] args) {
		System.out.println("이것은 메인함수 실행체크");
		LocalClassDemo ld = new LocalClassDemo();
		ld.method();
	}
}
