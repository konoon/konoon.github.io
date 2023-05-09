package source08_method;

public class SingleTonExam {

	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstace();
		SingleTon obj2 = SingleTon.getInstace();

		if(obj1 == obj2) {
			System.out.println("같은 SingleTon 객체입니다.");
		} else {
			System.out.println("다른 SingleTon 객체입니다.");
		}
	}

}
