package source14.thread_review;

// 쓰레드 객체  가져오기, 이름 설정, 쓰레드 수 파악

public class Test02_04 {
	public static void main(String[] args) {
		// 객체 가져오기
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());
		System.out.println("동작하는 쓰레드 수 = " + Thread.activeCount());
		
		// 쓰레드 이름 지정 (자동 지정)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 쓰레드 이름 지정 (직접 지정)
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 쓰레드 수 출력
		System.out.println("동작하는 쓰레드 수는 " + Thread.activeCount());
	}

}
