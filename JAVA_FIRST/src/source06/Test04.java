package source06;

import java.util.Scanner;

// do ~ while 문을 활용하여 메뉴값을 처리하는 프로그램 제작

public class Test04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int menu;
		do {
			System.out.print("\n 손님 주문하시겠습니까 \n");
			System.out.print("<1>카페라떼 <2>아메리카노 <3>카페모카 <4>안시킬래 \n");
			menu = s.nextInt();
			switch (menu) {
			case 1:
				System.out.print("#카페라떼를 주문하셨습니다.\n");
				break;
			case 2:
				System.out.print("#아메리카노를 주문하셨습니다.\n");
				break;
			case 3:
				System.out.print("#카페모카를 주문하셨습니다.\n");
				break;
			case 4:
				System.out.print("주문 메뉴가 나오면 알려드리겠습니다.\n");
				break;
			default:
				System.out.print("잘못주문\n");
			}
		// 선택한 메뉴가 4번이 아니라면 반복해서 계속 주문을 받게 while문을 처리함
		} while(menu != 4);
		s.close();
	}

}
