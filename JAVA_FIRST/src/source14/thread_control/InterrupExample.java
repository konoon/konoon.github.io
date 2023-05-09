package source14.thread_control;

// PrintThread2 실행 한 후 1초 후에 PrintThread2를 멈추도록 interrup() 메서드 호출

public class InterrupExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		// 쓰레드를 종료하기위해 InterruptedException발생 시킴
		thread.interrupt();
	}
}
