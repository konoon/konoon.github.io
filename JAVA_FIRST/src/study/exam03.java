package study;

public class exam03 {
	public static void main(String[] args) {
		int max  = 20; // 최대 판매 수량
		int sold = 0; // 현재 판매 수량
		int noShow = 17;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 나왔습니다.");
			
			if (i == noShow) {
				System.out.println(i + "번 손님 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;
			}
			
			sold++; // 판매처리
			if (sold == max) {
				System.out.println("소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
		System.out.println("---------------");
		
		sold = 0;
		int index = 0;
		while (index < 50) {
			index++;
			System.out.println(index + "번 손님 음식 나왔습니다.");
			
			if (index == noShow) {
				System.out.println(index + "번 손님 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;
			}
			
			sold++;
			if (sold == max) {
				System.out.println("금일 재료 소진되었습니다.");
				break;
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");
	}
}
