package source08_constructor;

public class Car1 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car1() {
		// TODO Auto-generated constructor stub
	}
	
	Car1(String model) {
		this(model, "은색", 250);
	}

	Car1(String model, String color) {
		this(model, color, 250);
	}

	Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
