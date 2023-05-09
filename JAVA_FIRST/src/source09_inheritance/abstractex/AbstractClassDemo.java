package source09_inheritance.abstractex;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// 추상 클래스는 shape 인스턴스 생성 못함 인스턴스는 클래스의 복제본 = 명확한데 추상클래스는 명확하지 않으니까 생성X
		// Shape shape = new Shape();
		
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.2f \n", c.findArea());
		
		System.out.println("=========");
		
		Ractangle r = new Ractangle(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f \n", r.findArea());
	}

}
