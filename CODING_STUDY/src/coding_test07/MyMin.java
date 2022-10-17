package coding_test07;

// 함수형 프로그래밍
// @FunctionalInterface : 추상 메서드 1개를 갖고 있는 함수형 인터페이스 알려줌
@FunctionalInterface
public interface MyMin {  // 함수형 인터페이스 생성
		public abstract int min(int x, int y); // 추상 메서드 생성
		// @FunctionalInterface : 추상 메서드 추가하면 안됨
//		public abstract int add(int x, int y);
		
		// default 메서드는 존재해도 상관 없음
		default void printDefault() {
			System.out.println("Hello Interface Default Method!");
		}
		// static 메서드도 존재해도 상관 없음
		static void printStatic() {
			System.out.println("Hello Interface Static Method!");
		}
		// @FunctionalInterface : 추상 메서드 추가하면 안됨
//		public abstract int multiple(int k, int z);
}

