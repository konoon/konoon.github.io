package source08_class_ex;

class Ace {
	private int x = 10;
	public int y = 20;
	
	public int getX() {
		return x;
	}
	
	public int add() {
		return (x + y);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Ace ace = new Ace();
		
		System.out.println(ace.getX());
		System.out.println(ace.y);
		
		System.out.println("합계값 = " + ace.add());
	}

}
