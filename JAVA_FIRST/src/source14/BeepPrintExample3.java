package source14;

import java.awt.Toolkit;

// Runable 익명 구현 객체 이용
public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					System.out.println("스레드 테스트" + i);
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵 " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
