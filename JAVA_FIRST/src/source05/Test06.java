package source05;

public class Test06 {

	public static void main(String[] args) {
		int dan, times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++ ) {
				System.out.printf(" %d X %d = %d \n", dan, times, dan * times);
			}
			System.out.println("");
		}

	}

}
