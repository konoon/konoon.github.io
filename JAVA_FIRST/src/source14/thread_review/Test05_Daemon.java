package source14.thread_review;

// 예를들어, 문서작성 프로그램의 경우, 10분마다 자동으로 문서를 저장하는 기능을 갖고 있다고 한다면, 10분마다 메인 쓰레드와 별도로 쓰레드의 보조적인 데몬 쓰레드가 실행되어 자동 문서 저장 기능을 수행합니다. 데몬 쓰레드는 메인(또는 일반)쓰레드의 보조적인 역할을 하는 것 이외에는 일반 쓰레드와 활용 방법은 동일

public class Test05_Daemon {
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 100; i++) { // 쓰레드 3개가 실행됨
				try {
					// 메인쓰레드 끝나는 println문 시행 후 for문에 의해 3개 쓰레드 실행함
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Thread.currentThread(): 현재 실행중인 Thread를 반환함
				// Thread.currentThread().getName(): 현재 실행중인 Thread이름을 반환함
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread threadDaemon = new Thread(task, "문서를 저장합니다.");
		threadDaemon.setDaemon(true); // 쓰레드를 데몬쓰레드로 설정함
		threadDaemon.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		System.out.println("메인 쓰레드가 끝났습니다.");
	}
}
