package source14.thread_add;

// Thread클래스를 상속하여 2개의 멀티 Thread 객체 생성 예시

class TaskThread extends Thread {

	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		// 자막 번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class CreateThread2extendsThread {
	public static void main(String[] args) {
		// TaskThread 객체 생성 및 시작
		Thread taskThread = new TaskThread();
		taskThread.start();
		
		// 비디오 프레임 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
