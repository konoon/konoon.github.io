package source14.thread_review;

class Thread_Ex1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i + " 번 " + i + " * " + i + " = " + (i * i));
		}
	}
}

public class Test01_01 {
	public static void main(String[] args) {
		Thread_Ex1 thread = new Thread_Ex1();
		thread.start();
	}

}
