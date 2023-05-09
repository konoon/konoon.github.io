package source14;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		// 스레드 이름을 User2으로 설정
		this.setName("User2");
		// 공유 객체인 calculator에 저장
		this.calculator = calculator;
	}

	@Override
	public void run() {
		// 공유 객체인 calculator의 메모리에 100을 저장 처리함
		calculator.setMemory(50);
	}
}
