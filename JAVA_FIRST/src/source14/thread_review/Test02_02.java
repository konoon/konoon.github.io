package source14.thread_review;

// Runnable 인터페이스를 상속해서 3개의 쓰레드 객체 생성 예시

class TaskRunnable implements Runnable {

	@Override
	public void run() {
		// 자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) { }
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- (자막 번호)" + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
	}
	
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		// 비디오 프레임 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
		}
	}
}

public class Test02_02 {
	public static void main(String[] args) {
		// TaskRunnable 객체 생성
		Runnable taskRunnable = new TaskRunnable();
		Thread thread1 = new Thread(taskRunnable);
		thread1.start();
		
		// VideoFileRunnable 객체 생성
		Runnable videoFileRunnable = new VideoFileRunnable();
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
	}
}
