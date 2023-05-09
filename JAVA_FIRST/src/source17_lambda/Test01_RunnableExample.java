package source17_lambda;

// 람다식은 람수형 프로그래밍으로 함수형 인터페이스와 추상 메서드를 생성함
public class Test01_RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
 