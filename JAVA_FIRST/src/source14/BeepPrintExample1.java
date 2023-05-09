package source14;

// 메인 스레드만 이용한 경우 : 0.5초 주기로 비프음을 발생시키면서 출력 작업 스레드 구현

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초간 일시정지
			} catch (Exception e) {
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("머리가 띵!" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
