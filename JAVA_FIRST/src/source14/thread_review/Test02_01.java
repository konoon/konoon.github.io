package source14.thread_review;

// Thread 클래스 상속해서 3개의 Thread 생성 예시

class TaskThread extends Thread {
	@Override
	public void run() {
		// 자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) { }
		// 자막 번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
	}
}

class VideoFileThread extends Thread {
	@Override
	public void run() {
		// 비디오 프레임 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		// 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
	}
}

public class Test02_01 {
	public static void main(String[] args) {
		
		// TaskThread 객체 생성 및 시작
		Thread taskThread = new TaskThread();
		taskThread.start();
		
		// VideoFileThread 객체 생성 및 시작
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
	}
}
