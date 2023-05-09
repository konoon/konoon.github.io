package source14;

import java.awt.Toolkit;

// Thread 익명 자식 객체를 이용해서 작업 스레드를 만들 수 있는 예시
public class BeepPrintExample5 {
	public static void main(String[] args) {
		Thread thread = new Thread() {

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
		};
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
