package source11.review.exam01;

public class MemberClassDemo {

	private String secret = "비공개";
	String s = "외부";
	
	public MemberClassDemo() {
		System.out.println("※ MemberClassDemo 생성자");
	}
	
	class MemberClass {
		public MemberClass() {
			System.out.println("★ MemberClass 생성자");
		}
		
		String s = "내부";
		
		public void show1() {
			System.out.println("인스턴스 멤버 클래스");
			System.out.println(secret);
			System.out.println(s);
			System.out.println(MemberClassDemo.this.s);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수 체크");
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();
		System.out.println(m1.s);
		m1.show1();
	}

}
