package source10.exam02;

interface Mobile {
	void inMyPocket();
}

public class MobileFan extends Fan implements Mobile {
	
	@Override
	public void turnOn() {
		System.out.println("모바일 선풍기를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("모바일 선풍기를 끕니다.");
	}
	
	@Override
	public void inMyPocket() {
		System.out.println("모바일 선풍기를 주머니에 넣습니다");
	}

	public static void main(String[] args) {
		MobileFan mf = new MobileFan();
		
		mf.turnOn();
		mf.turnOff();
		mf.inMyPocket();;
	}
}


