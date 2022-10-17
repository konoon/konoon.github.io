package coding_test07.exam03;

public class MyFunctionalInterfaceExmaple {
	public static void main(String[] args) {

		MyFunctionalInterface fi;
		
		// 매개변수 2개를 갖고 있는 method() 메서드 활용
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));  // 2 + 5 = 7
		
		fi = (x, y) -> {
				return x + y;
		};
		System.out.println(fi.method(2, 5));  // 2 + 5 = 7
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));  // 2 + 5 = 7
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));  // 2 + 5 = 7
		
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}
