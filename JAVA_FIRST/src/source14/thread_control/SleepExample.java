package source14.thread_control;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
//			toolkit.beep();
			System.out.println("스레드 테스트 " + i);
			try {
				// 3초간 일시정지 상태 만들어 줌
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}
}
