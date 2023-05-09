package source17_lambda.exam01;

public class MyFuntionalInterfaceExample2 {

	public static void main(String[] args) {
		MyFuntionalInterface fi2; // 참조 변수 fi2 선언
		// method() 메서드에 매개변수를 갖지 않는 경우
		fi2 = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi2.method();
		
		fi2 = () -> {
			System.out.println("method call2");
		};
		fi2.method();
		
		fi2 = () -> System.out.println("method call3");
		fi2.method();
	}
}
