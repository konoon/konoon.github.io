package source08_constructor;

public class Car {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수 model을 지정할 수 있는 생성자
	Car(String model) {
		this.model = model;
	}

	// 매개변수 model과 color를 지정할 수 있는 생성자
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 매개변수 model과 color, maxSpeed를 지정할 수 있는 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
