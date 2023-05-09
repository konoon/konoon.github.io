package source13;

// for문이 10번 반복하다가 i가 5가되면 system.exit(0)가 실행되어 프로그램 종료

public class ExitExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("마무리 코드");
				break; // System.exit(0)보다는 break 사용을 권장
//				System.exit(0); // 시스템 종료일 때는 System.exit(0)사용
			}
		}
	}

}
