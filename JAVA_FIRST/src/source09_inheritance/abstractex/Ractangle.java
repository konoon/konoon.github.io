package source09_inheritance.abstractex;

public class Ractangle extends Shape {

	int width, height;
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}

	// 메서드 재정의
	@Override
	public double findArea() {
		return width * height;
	}


}
