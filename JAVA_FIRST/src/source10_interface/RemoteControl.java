package source10_interface;

public interface RemoteControl {
	// 상수 (컴파일 과정에서 public static final이 자동으로 붙어서 처리됨)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 인터페이스에서는 추상메서드만 사용 가능
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
