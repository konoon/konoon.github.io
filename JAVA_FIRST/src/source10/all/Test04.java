package source10.all;

import java.util.Scanner;

class Car3 {
	Car3() {
		System.out.println("슈퍼 클래스 생성자 호출(파라미터 변수 없음)");
	}
	
	Car3(String str) {
		System.out.println("슈퍼 클래스 생성자 호출 " + str);
	}
}

class Sedan3 extends Car3 {
	Sedan3(String str) {
//		super(str);
		System.out.println("서브 클래스 생성자 호출 " + str);
	}
}

public class Test04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("모델명을 입력바랍니다. ==>");
		String modle = scan.nextLine();
		
		Sedan3 sedan = new Sedan3(modle);
		scan.close();
	}
}
