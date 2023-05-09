package source10.all;

interface Car10 {
	abstract void work();
}

interface Cannon {
	abstract void fire();
}

class Tank implements Car10, Cannon {
	@Override
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
	}

	@Override
	public void work() {
		System.out.println("탱크가 앞으로 달려갑니다.");
	}
}

public class Test09 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.work();
		tank.fire();
	}
}
