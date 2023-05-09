package source04_add;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("상품코드를 입력해주세요. ==> ");
		System.out.println("희망 상품을 TV, 자동차, 컴퓨터 중에서 입력해주세요. ==> ");
//		int code = scan.nextInt();
		String product = scan.next();
		switch (product) {
		case "TV":
			System.out.println("상품은 A입니다.");
			break;
		case "자동차":
			System.out.println("상품은 B입니다.");
			break;
		case "컴퓨터":
			System.out.println("상품은 C입니다.");
			break;
		default:
			System.out.println("상품은 없습니다.");
			break;
		} scan.close();
	}

}
