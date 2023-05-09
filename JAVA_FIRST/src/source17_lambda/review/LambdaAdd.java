package source17_lambda.review;

public class LambdaAdd {
	public static void main(String[] args) {

		MyAdd add = (a, b) -> a + b;
		
		System.out.println(add.add(3, 5));
		
		add.print();
		
		MyAdd.printStatic();
	}
}

/* 실행 결과
8
인터페이스의 default 메서드는 사용이 가능합니다!
인터페이스의 static 메서드는 사용이 가능합니다!
*/