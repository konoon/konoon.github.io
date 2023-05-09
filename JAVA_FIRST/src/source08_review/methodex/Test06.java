package source08_review.methodex;

// [메서드 Call By Value 인자값 호출 방식]
// var1의 값이 increase메서드의 인자로 전달되면, 그 값이 로컬 변수 n에 복사되어서 main함수의 지역 변수인 var1의 값은 increase 메서드가 수행한 후에도 변하지 않는다.

public class Test06 {
	public int increase(int n) {
		++n;
		System.out.println("increase 메서드에서 ++n 되어진 값 = " + n);
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		Test06 val = new Test06();
		
		int result = val.increase(var1); // var 인스턴스가 increase()메서드 호출
		System.out.println("var1 = " + var1 + ", result = " + result);
	}

}
