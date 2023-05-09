package source10.exam01;

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}

public class Coin01 {
	public static void main(String[] args) {
		System.out.println("DIME은 " + Coin.DIME + "센트 입니다.");
	}
}
