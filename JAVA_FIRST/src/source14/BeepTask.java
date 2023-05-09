package source14;

import java.awt.Toolkit;

// 비프음을 들려주는 작업 정의

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch (Exception e) {
			}
		}
	}
}
