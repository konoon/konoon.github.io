package study;

public class exam05 {
	 public static void main(String[] args) {
		String[] coffees = {"아메리카노", "모카", "라떼", "카푸치노"};
		
		for (int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i] + " 하나");
		}
		System.out.println("-------------");
		
		for (String coffee : coffees) {
			System.out.println(coffee + " 하나");
		}
		
		String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
		String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
		String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
		
		String[][] seats = new String[][] {
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"} 
		};
		System.out.println(seats[2][4]);
		
	}
}
