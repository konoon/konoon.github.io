package source08_method;

public class Car {
	
	// 필드
	int gas;
	String modle;
	int speed;
	
	public Car() {
	}

	Car(String modle) {
		this.modle = modle;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void runInstance() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.modle + "달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
	
	// 메서드 
	// 리턴값이 없는 setGas() 메서드로 매개변수 gas에 매개변수값을 받아서 gas 필드값을 변경함
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값이 boolean인 메서드로 gas 필드값이 0이면 false, 0이 아니면 true를 리턴해줌
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴해 줌
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴해 줌
	}

	// 리턴값이 없는 void메서드로 gas 필드값이 0이면 else문의 return문으로 run() 메서드를 강제 종료합니다.
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다! (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				 return;
			}
		}
	}

}
