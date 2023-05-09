package source14.thread_review.synchro;

// 쓰레드 동기화:  동기화 블록 지정(동시 접근자 끼어들기 제한) 예시

class CarThread extends Thread {
	private String who;
	private ShareCar car;
	private String where;

	public CarThread(String who, ShareCar car, String where) {
		super();
		this.who = who;
		this.car = car;
		this.where = where;
	}
	
	@Override
	public void run() {
		car.drive(who, where);
	}
}

public class SynchroDemo {
	public static void main(String[] args) {
		ShareCar car = new ShareCar();
		new CarThread("장나라", car, "서울").start();
		new CarThread("김희선", car, "독도").start();
		new CarThread("이영애", car, "광주").start();
	}
}
