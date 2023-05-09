package source14.thread_review;

// 익명(이너) 클래스 활용 쓰레드 구현
public class Test02_03 {
	public static void main(String[] args) {
		// 자막 번호를 출력하는 쓰레드의 익명(이너)클래스 정의
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 자막 번호 하나 ~ 다섯
				String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) { }
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(" - (자막 번호) " + strArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) { }
				}
			}
		});
		// 비디오 프레임 번호를 출력하는 쓰레드의 익명(이너) 클래스 정의
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int[] intArray = {1, 2, 3, 4, 5};
				for (int i = 0; i < intArray.length; i++) {
					System.out.print("(비디오 프레임) " + intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		// Thread 실행
		thread1.start();
		thread2.start();
		System.out.println("============");
		
		// 쓰레드 수 확인
		Thread countThread = Thread.currentThread();
		System.out.println("동작하는 스레드 수 " + Thread.activeCount());
	}
}
