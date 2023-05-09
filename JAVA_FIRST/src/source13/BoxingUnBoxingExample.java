package source13;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing : 기본 타입을 객체 타입으로
		int num = 100;
		Integer obj1 = new Integer(num);
		System.out.println("Boxing 처리된 " + obj1);
		
		String num2 = "200";
		Integer obj2 = new Integer(num2);
		
		String num3 = "300";
		Integer obj3 = Integer.valueOf(num3);
		
		// UnBoxing : 객체 타입을 기본 타입으로
		int value1 = obj1.intValue();
		System.out.println("UnBoxing 처리된 " + value1);
		int value2 = obj2.intValue();
		System.out.println("UnBoxing 처리된 " + value2);
		int value3 = obj3.intValue();
		System.out.println("UnBoxing 처리된 " + value3);
	}

}
