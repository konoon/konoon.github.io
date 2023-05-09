package source14;

import java.awt.Toolkit;

// Runable을 생성하지 않고, Thread의 하위 클래스로 작업 스레드를 정의해서 활용하는 소스 코딩
public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		super.run();
	}
	
}
