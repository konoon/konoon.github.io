package source10;

interface Movable {
	void move(int x);
}

class Car implements Movable {
	private int pos = 0;
	
	@Override
	public void move(int x) {
		pos += x;
	}
	
	public void show() {
		System.out.println(pos + "m 이동함");
	}
}

public class Test04 {
	public static void main(String[] args) {
		Movable m = new Car();
		m.move(5);
		
//		m.show();
		
		Car c = (Car) m;
		c.move(10); //
		c.show();
	}
}
