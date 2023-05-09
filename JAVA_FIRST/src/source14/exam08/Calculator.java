package source14.exam08;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 계산기 메모리에 값을 저장하는 synchronized 동기화 setMemory() 메서드 정의
	public synchronized void setMemory(int memory) {
		// 매개값을 memory 필드에 저장 처리함
		this.memory = memory;
		try {
			Thread.sleep(2000); // 스레드를 2초간 일시 정지 시킴
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
}
