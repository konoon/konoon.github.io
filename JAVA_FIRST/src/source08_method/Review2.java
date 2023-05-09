package source08_method;

public class Review2 {

	public static void main(String[] args) {

		Person r1 = new Person();
		
		System.out.println(r1.name);
		
		Person r2 = new Person("전지현");
		System.out.println(r2.name);
		
		Person r3 = new Person("송혜교", "캐나다");
		System.out.println(r3.name + "님은" + r3.address + "에서 거주중입니다.");
		
		r1.printToday();
		r2.printToday();
		
		System.out.println(r2.plus(5, 3, 7));
	}

}
