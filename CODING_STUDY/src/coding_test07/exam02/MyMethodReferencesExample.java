package coding_test07.exam02;

public class MyMethodReferencesExample {
	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;  // 7*5 = 35
			System.out.println(result);
		};
		fi.method(7); // method() 메서드에 인수값으로 7을 대입해 줌.
		
		fi = (x) ->  {
			System.out.println(x*5);  // 7*5 = 35
		};
		fi.method(7); // method() 메서드에 인수값으로 7을 대입해 줌.
		
		fi = x -> System.out.println(x * 5);  // 7*5 = 35
		fi.method(7); // method() 메서드에 인수값으로 7을 대입해 줌.
	}
}
/* 실행 결과
35
35
35
*/

