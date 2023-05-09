package source04;

public class Test07_For {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 *** ");
			for(int value = 1; value <= 9; value++) {
				System.out.println(dan + " X " + value + " = " + (dan * value));
			}
		}
	}

}
