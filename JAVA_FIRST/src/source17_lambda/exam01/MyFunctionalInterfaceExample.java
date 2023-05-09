package source17_lambda.exam01;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {

		MyFunctionalInterface fi;   // 참조 변수 fi 선언
		// method() 메서드에 매개 변수를 갖지 않는 경우
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
