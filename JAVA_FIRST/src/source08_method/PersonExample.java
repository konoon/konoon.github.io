package source08_method;

public class PersonExample {

	public static void main(String[] args) {
		PersonFinal p1 = new PersonFinal("200213-252258", "장나라");
		
		System.out.println(p1.NATION);
		p1.height = 200;
		System.out.println(p1.height);
		System.out.println(p1.SSN);
		// final로 선언해준 변수는 변경 못하고 6번째 줄에 있는 값을 받음
		p1.name = "김희선";
	}

}
