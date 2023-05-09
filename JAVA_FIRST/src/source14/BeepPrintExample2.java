package source14;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		// 작업 스레드 start() 메서드 호출
		thread.start();
		
		// 메인 스레드 for문 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵 " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
