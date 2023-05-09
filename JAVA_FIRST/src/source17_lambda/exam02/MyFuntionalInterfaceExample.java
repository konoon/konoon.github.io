package source17_lambda.exam02;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {
		MyFuntionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(7);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(7);
		
		// 매개변수 때문에 x 소괄호 생략해도됨
		fi = x -> System.out.println(x * 5);
		fi.method(7); // method() 메서드에 인수값으로 7을 대입해줌
	}

}
