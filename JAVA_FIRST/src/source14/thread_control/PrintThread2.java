package source14.thread_control;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
//		try {
			while (true) {
				System.out.println("실행 중");
				
				// if문으로 써서 멈춰도되고 try로 멈춰도됨
				if(Thread.interrupted()) {
					break;
				}
//				Thread.sleep(1); // 일시정지 코드
			}
//		} catch (InterruptedException e) { }
		System.out.println("자원(파일, 네트워크 연결 등) 정리");
		System.out.println("실행 종료");
	}
	
}
