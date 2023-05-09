package source09;

public class Car {
	// 필드
	public int speed;
	
	// 메서드
	public void speedUp() {
		speed += 1;
	}
	
	public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
