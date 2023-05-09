package source05;

public class Test06_01 {
	// 구구단 가로형
	public static void main(String[] args) {
		int dan, times;
		
		for(times = 1; times <= 9; times++) {
			for(dan = 2; dan <= 9; dan++) {
				// %3 -> 3칸을 띄워주는 것
				System.out.printf(" %3d X %d = %2d", dan, times, dan * times);
			}
			System.out.println("");
		}
	}

}
