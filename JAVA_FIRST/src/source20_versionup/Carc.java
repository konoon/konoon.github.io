package source20_versionup;

public interface Carc {
	double PI = 3.14;
	
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	
	static void print() {
		System.out.println("인터페이스에 정적 static print() 메서드 정의");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		// 정적 메서드에서 private static 메서드 호출
		myStaticMethod();
		return total;
	}
	
	default void printDefault() {
		System.out.println("인터페이스에 디폴트 default printDefault() 메서드 정의");
		myMethod();
	}
	
	// 자바 9버전 부터 private 메서드활용이 가능하게 됨
	private void myMethod() {
		System.out.println("자바 9버전 부터 추가된 인터페이스 private 메서드 활용");
	}
	
	private static void myStaticMethod() {
		System.out.println("자바 9버전 부터 추가된 인터페이스 private 메서드 활용");
	}
}
