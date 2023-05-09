package source10_interface.polymorphism.casting;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 또 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
