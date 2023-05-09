package source14.thread_control;

// 1초 주기로 save() 메서드를 자동 호출하도록 AutoSaveThread를 작성하고, 메인 쓰레드가 3초 후 종료되면 AutoSaveThread도 같이 종료 되도록AutoSaveThread를 데몬 쓰레드로 만들기 아래는 메인 쓰레드가 실행되는 코드
public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 쓰레드 종료");
	}

}
