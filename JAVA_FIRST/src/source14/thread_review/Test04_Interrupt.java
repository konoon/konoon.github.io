package source14.thread_review;

// interrupt() 메서드를 이용한 쓰레드의 안전한 종료 인터럽트는 쓰레드에게 특정 상황이 발생했음을 알리기 위한 소프트웨어적인 비동기 신호입니다.인터럽트를 받은 쓰레드는 내부적으로 인터럽트 플래그값을 설정합니다. 만약 인터럽트를 받은 쓰레드가 sleep, join, wait과 같은 메서드 호출에 의해 대기상태에 있었다면 해당 메서드는 발생시키면서 대기상태에서 빠져나옴 인터럽트가 발생하면 해당 플래그값은 true로 설정됨

public class Test04_Interrupt {
	public static void main(String[] args) {
		// 매개변수가 없는 람다식 Runnable task = () -> {실행문;...}
		// 람다식 -> 익명 구현 객체 task와 타입 매개변수가 없는 () 코드 블록 -> {} 실행
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("실행중입니다.");
					Thread.sleep(30);
				}
			} catch (InterruptedException e) {
				// 인터럽트 처리 코드
//				e.printStackTrace();
				System.out.println("쓰레드가 안전하게 종료되었습니다.");
			}
		};
		Thread threadRunnable = new Thread(task); 
		threadRunnable.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		// interrupt() 메서드이용으로 쓰레드 안전하게 종료
		threadRunnable.interrupt();
	}

}
