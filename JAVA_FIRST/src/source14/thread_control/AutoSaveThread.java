package source14.thread_control;

// 1초 주기로 save() 메서드를 자동 호출하도록 AutoSaveThread를 작성하고, 메인 쓰레드가 3초 후 종료되면 AutoSaveThread도 같이 종료 되도록AutoSaveThread를 데몬 쓰레드로 만들기 아래는 1초 주기로 save() 메서드를 호출하는 데몬 쓰레드 소스 코드

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { 
				break;
			}
			save();
		}
	}
}
