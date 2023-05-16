package study;

public class exam02 {
	public static void main(String[] args) {
		int distance = 25;
		int move = 0;
		
		while (move < distance) {
			System.out.println(move );
			move += 3;
		}
		System.out.println("도착");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
