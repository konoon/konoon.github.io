package source08_method;

public class SingleTonExam2 {

	public static void main(String[] args) {
		SingleTon obj3 = SingleTon.getInstace();
		SingleTon obj4 = SingleTon.getInstace();

		if(obj4 == obj4) {
			System.out.println("같은 SingleTon 객체입니다.");
		} else {
			System.out.println("다른 SingleTon 객체입니다.");
		}
	}

}
