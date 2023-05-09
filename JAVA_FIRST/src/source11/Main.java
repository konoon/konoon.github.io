package source11;

public class Main {
	public static void main(String[] args) {
		Ace ace = new Ace();
		
		// 인스턴스 멤버 클래스 객체 생성
		Ace.Base base = ace.new Base();
		base.field1 = 3;
		base.method1();
		
		// 정적 static 멤버 클래스 객체 생성
		Ace.Case c = new Ace.Case();
		c.field1 = 3;
		c.method1();
		Ace.Case.field2 = 3;
		Ace.Case.method2();
		
		// 로컬 클래스 객체 생성을 위한 메서드 호출
		ace.method();
	}

}
