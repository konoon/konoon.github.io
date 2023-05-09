package source17_lambda.review;

// @FunctionalInterface = 추상 메서드 1개만 활용할 수 있음
@FunctionalInterface
public interface MyAdd {
	public int add(int x, int y);  // 추상 메서드	
//	public int minus(int x, int y);
	
	default void print() {
		System.out.println("인터페이스의 default 메서드는 사용이 가능합니다!");
	}
	
	static void printStatic() {
		System.out.println("인터페이스의 static 메서드는 사용이 가능합니다!");
	}
	
}
