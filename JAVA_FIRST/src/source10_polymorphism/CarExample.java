package source10_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) { // Car 객체의 run메소드 5번 반복실행
			int problemLocation = car.run();
		
			switch (problemLocation) {
			// 1번 타이어(앞왼쪽)에 문제가 생기면 한국타이어로 교체
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
				
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
				
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 한국타이어로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
			// 1회전시 출력되는 내용을 구분해주는 구분선 표시
			System.out.println("==========");
		}
	}

}
