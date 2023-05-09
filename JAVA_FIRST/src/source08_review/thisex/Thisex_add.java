package source08_review.thisex;

import java.util.Scanner;

class Car {
	private String model;
	private int makeYear;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	
}

public class Thisex_add {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 자동차 모델명을 입력해 주시기 바랍니다. ==> ");
		String model = scan.nextLine();
		System.out.println("당신의 자동차 년식을 숫자로 입력해 주시기 바랍니다. ==> ");
		int makeYear = scan.nextInt();
		
		Car myCar = new Car();
		myCar.setModel(model);
		System.out.println("나의 자동차 모델은 " + myCar.getModel() + "입니다.");
		myCar.setMakeYear(makeYear);
		System.out.println("나의 자동차는 " + myCar.getMakeYear() + "년식 입니다.");
	}

}
