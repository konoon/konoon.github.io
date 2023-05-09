package source06;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				// break; 로만 쓰면 A-Z까지의 g가 나오고 break Outter; 로 쓰면 A-g에서 멈춤
				}
			}
		}
		System.out.println("프로그램 실행 종료!");
	}

}
