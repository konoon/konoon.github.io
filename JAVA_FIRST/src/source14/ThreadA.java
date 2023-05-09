package source14;

public class ThreadA extends Thread {
	public ThreadA() {
		// 사용자 정의 스레드 이름 설정
		setName("장나라 ThreadA");
	}

	@Override
	public void run() {
		// 장나라 ThreadA 실행 내용
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}
