package source14.thread_review.synchro;

public class ShareCar {
	
	// synchronized를 걸면 다른게 중간에 못끼어듬
	public synchronized void drive(String name, String where) { 
		System.out.println(name + "님이 자동차에 탔습니다.");
		for (int i = 0; i < 3; i++) {
			System.out.println(name + "님이 자동차를 운전합니다.");
		}
		System.out.println(name + "님이" + where + "에 도착했습니다.");
	}
}
