package source04;

public class Test03_If_lotto {
	public static void main(String[] args) {
		
		int num = (int)Math.random()*6 + 1;
		
		if(num == 1) {
			System.out.println("주사위가 1이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("주사위가 2가 나왔습니다.");
		} else if(num == 3) {
			System.out.println("주사위가 3이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("주사위가 4가 나왔습니다.");
		} else if(num == 5) {
			System.out.println("주사위가 5가 나왔습니다.");
		} else {
			System.out.println("주사위가 6이 나왔습니다.");
		}
	}
}
