package source09_inheritance.abstractex;

public class Circle extends Shape {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	// 추상클래스, 메소드에선 @Override 필수
	@Override
	void draw() {
		System.out.println("원을 그리다");
	}

	@Override
	public double findArea() {
		return PI * radius * radius;
	}

}
