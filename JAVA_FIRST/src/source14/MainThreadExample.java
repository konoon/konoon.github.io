package source14;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		// 공유 객체 설정
		user1.setCalculator(calculator);
		// user1 스레드 시작
		user1.start();
		
		User2 user2 = new User2();
		// 공유 객체 설정
		user2.setCalculator(calculator);
		// user2 스레드 시작
		user2.start();
		// calculator 공유 객체를 사용하고 있어서 나중에 셋팅한 50값이 똑같이 나옴
	}
}
