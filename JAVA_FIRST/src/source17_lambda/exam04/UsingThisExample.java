package source17_lambda.exam04;

public class UsingThisExample {
	public static void main(String[] args) {

		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();		
	}
}

/* 실행 결과
outterField : 10
outterField : 10

innerField : 20
innerField : 20
*/