package source14;

public class ThreadB extends Thread {

	@Override
	public void run() {
		// ThreadB 실행 내용
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}
