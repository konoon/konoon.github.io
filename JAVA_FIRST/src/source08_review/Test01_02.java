package source08_review;

import java.util.Scanner;

class Phone {
	String model;
	int value;
	
	public Phone() {
		
	}
	
	public Phone(String model, int value) {
		super();
		this.model = model;
		this.value = value;
	}

	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰");
	}
}

public class Test01_02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("모델명을 입력해 주세요. ==>");
		String model = scan.nextLine();
		System.out.println("가격을 정수값으로 입력해 주세요. ==>");
		int value = scan.nextInt();
		
//		Phone secondPhone = new Phone(model,value);
//		secondPhone.print();
		
		Phone thirdPhone = new Phone();
		thirdPhone.model = model;
		thirdPhone.value = value;
		thirdPhone.print();
		
		// 인스턴스 객체 myPhone 생성
//		Phone myPhone = new Phone();
//		myPhone.model = "갤럭시 S20";
//		myPhone.value = 100;
//		myPhone.print();
//		
//		Phone yourPhone = new Phone();
//		yourPhone.model = "아이폰13";
//		yourPhone.value = 120;
//		yourPhone.print();
		
		scan.close();
	}

}
