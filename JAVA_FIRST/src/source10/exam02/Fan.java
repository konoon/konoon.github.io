package source10.exam02;

public class Fan implements ElectricProduct, RemoteControllable {

	@Override
	public void remoteOn() {
		System.out.println("선풍기를 원격으로 켭니다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("선풍기를 원격으로 끕니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("선풍기를 직접 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("선풍기를 직접 끕니다.");
	}

}
