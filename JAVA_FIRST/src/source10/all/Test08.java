package source10.all;

// 인터페이스는 추상, static, final, 디폴트만 취급

interface Car9 {
	static final int CAR_COUNT = 0;
	abstract void work(); 
}

class Sedan9 implements Car9 {
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

class Truck9 implements Car9 {
	@Override
	public void work() {
//		int number = CAR_COUNT;
//		number = 200;
//		Car9.CAR_COUNT = 200; <- final로 사용했기때문 interface값 수정 X
		System.out.println("트럭이 짐을 싣고 있습니다." + Car9.CAR_COUNT);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Sedan9 sedan = new Sedan9();
		sedan.work();
		
		Truck9 truck = new Truck9();
		truck.work();
	}
}
