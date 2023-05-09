package source17_lambda.exam04;

// 클래스의 멤버 사용

public class UsingThis {
	
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			// 람다식 활용
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				// UsingThis.this.outterField : 바깥 객체의 참조를 얻기 위해서는
				// 클래스명.this를 사용함
				
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
				// this.innerField : 람다식 내부에서 this는 Inner 객체를 참조함
			};
			fi.method();
		}
	}

}
