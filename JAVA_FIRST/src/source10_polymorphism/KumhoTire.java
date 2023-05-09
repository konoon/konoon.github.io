package source10_polymorphism;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumlatedRotation; // 누적 회전수 1증가
		if(accumlatedRotation < maxRotation) {
			// 정상 회전 최대일 경우 실행(누적포함)
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			// 펑크 최대일 경우 실행(누적포함)
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
		}
		return false;
	}

}
