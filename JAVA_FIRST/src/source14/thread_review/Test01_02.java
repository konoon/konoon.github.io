package source14.thread_review;

// Runnable 인터페이스를 implements하는 클래스를 선언함
class Runnable_Ex1 implements Runnable {

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

public class Test01_02 {
	public static void main(String[] args) {
		Runnable_Ex1 thread = new Runnable_Ex1();
		Thread obj = new Thread(thread);
		obj.start();
	}
}
