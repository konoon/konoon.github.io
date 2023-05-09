package source08_method;

public class Review {

	public static void main(String[] args) {
		Person p1 = new Person();

		System.out.println(p1.name);
		System.out.println(p1.address);
		
		Person p2 = new Person("김희선");
		System.out.println(p2.name);
		
		Person p3 = new Person("김태희", "울릉도");
		System.out.println(p3.name);
		System.out.println(p3.address);
		
		Person myObject = new Person();
		myObject.printToday();
		
		int result = myObject.plus(10, 20, 30);
		System.out.println("3개의 숫자의 합 = " + result);
	}

}
