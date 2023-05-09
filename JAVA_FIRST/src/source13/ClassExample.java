package source13;

import source08.Car;

// Class 객체 정보 얻기
public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// 첫번째 방법
		Class cs = Car.class;
		// getName()는 해당 클래스에 대한 정보 가져오는것
		System.out.println(cs.getName());
		
		Class mb = Member.class;
		System.out.println(mb.getName());
		
		// 두번째 방법
		Class cs1 = Class.forName("source08.Car");
		System.out.println(cs1.getSimpleName());
		
		Class mb1 = Class.forName("source13.Member");
		System.out.println(mb1.getSimpleName());
		
		// 세번째 방법
		Car car = new Car();
		Class cs2 = car.getClass();
		System.out.println(cs2.getPackage().getName());
		
		MemberId mb2 = new MemberId("ja");
		Class cs3 = mb2.getClass();
		System.out.println(cs3.getName());
	}

}
