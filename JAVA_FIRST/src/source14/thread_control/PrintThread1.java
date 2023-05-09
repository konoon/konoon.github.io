package source14.thread_control;

// 무한 반복해서 출력하는 스레드 구현
public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행 중입니다.");
		}
		System.out.println("자원(파일, 네트워크)을 정리함");
		System.out.println("실행을 종료함");
	}
	
}
