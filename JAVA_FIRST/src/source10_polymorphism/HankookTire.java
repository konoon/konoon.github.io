package source10_polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}

	// 다른 내용을 출력하기 위해 roll() 메서드 재정의 -> 메서드 오버라이딩
	@Override
	public boolean roll() {
		++accumlatedRotation; // 누적 회전수 1증가
		if(accumlatedRotation < maxRotation) {
			// 정상 회전 최대일 경우 실행(누적포함)
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			// 펑크 최대일 경우 실행(누적포함)
			System.out.println("*** " + location + "HankookTire 펑크 ***");
		}
		return false;
	}
}
