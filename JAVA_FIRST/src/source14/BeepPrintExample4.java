package source14;

// 메인 스레드와 작업 스레드가 동시에 실행됨
public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
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
