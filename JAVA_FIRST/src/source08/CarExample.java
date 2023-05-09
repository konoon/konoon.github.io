package source08;

public class CarExample {

	public static void main(String[] args) {
		
		// 객체 생성 (인스턴스 객체)
		Car myCar = new Car();

		// 앞서 Car 클래스의 필드값 참조
		System.out.println("제작 회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);
		
		// 앞서 Car 클래스의 필드값 참조 내용 변경
		myCar.speed = 200;
		System.out.println("수정된 속도: " + myCar.speed);
		
		// 객체 생성 (인스턴스 생성)
		Car yourCar = new Car();
		
		System.out.println("제작 회사: " + yourCar.company);
		
		yourCar.model = "베뉴";
		System.out.println("모델명: " + yourCar.model);
		
		yourCar.color = "빨강";
		System.out.println("색상: " + yourCar.color);
	}

}
