package source08_package.sec06.exam03.package1;

// default 기본 접근 제한자(public을 지움) -> 같은 패키지에서는 쓸수있지만 다른 패키지에서는 사용 X

public class AceField {
	
	public int field1; // public 접근 제한자
	int field2; // default 접근 제한자
	private int field3; // private 접근 제한자
	
	public AceField() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
		// 메소드
		public void method1() {  // public 접근 제한 적용
		}
		void method2() {  // default 접근 제한 적용
		}
		private void method3() {  // private 접근 제한 적용
		}
}
