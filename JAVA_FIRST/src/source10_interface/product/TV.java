package source10_interface.product;

public class TV implements controllable, RemoteControllable {

	@Override
	public void remoteOn() {
		System.out.println("티비를 멀리서 remote로 켠다");
	}

	@Override
	public void remoteOff() {
		System.out.println("티비를 멀리서 remote로 끈다");
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끈다");
	}
	
}
