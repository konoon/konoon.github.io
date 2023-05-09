package source10_interface.product;

public class NoteBookPc extends Computer implements Portable {
	
	@Override
	public void turnOn() {
		System.out.println("노트북 PC를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("노트북 PC를 끈다");
	}

	@Override
	public void inMyBag() {
		System.out.println("노트북 PC를 가방에 넣습니다.");
	}

	public static void main(String[] args) {
		NoteBookPc n = new NoteBookPc();
		
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
}
