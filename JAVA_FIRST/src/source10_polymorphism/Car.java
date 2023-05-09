package source10_polymorphism;

public class Car {
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 메소드
	// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메서드 호출, false를 리턴하는 roll()이 있을경우 stop() 호출
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {
			stop();
			// return 1;은 첫번째 타이어가 터졌다는 의미
			return 1;
		}
		
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
		
	}
}
