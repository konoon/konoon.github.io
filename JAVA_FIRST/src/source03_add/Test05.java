package source03_add;

public class Test05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int x = 2;
		
		int num1, num2, num3, num4;
		
		num1 = ++a + x; // ++이 앞에 붙으면 모든 연산에서 선순위 처리한다.
		System.out.println("num1 = " + num1); // num1 = 1만큼 증가한 11 + 2 = 13
		System.out.println("a = " + a); // ++이 앞에 붙든 뒤에 붙든  a값은 1만큼 증가함 a = 11
		
		System.out.println("===============");
		
		num2 = b++ + x; // ++이 뒤에 붙으면 모든 연산에서 후순위 처리한다.
		System.out.println("이  단계에서 b의 값은 = " + b);
		System.out.println("num2 = " + num2); // num2 = 1만큼 증가하지 않은 상태 10 + 2 = 12
		System.out.println("b = " + b); // ++이 앞에 붙든 뒤에 붙든  b값은 1만큼 증가함 b = 11
		
		System.out.println("===============");
		
		num3 = --c + x; // --이 앞에 붙으면 모든 연산에서 선순위 처리한다.
		System.out.println("num3 = " + num3);
		System.out.println("c = " + c); // --가ㅡ앞에 붙든 뒤에 붙든 c값은 1만큼 감소함(c = 9)
		
		System.out.println("===============");
		
		num4 = d-- + x; // --가 뒤에 붙으면  모든 연산에서 후순위 처리한다.
		System.out.println("이  단계에서 d의 값은 = " + d);
		System.out.println("num4 = " + num4); // num4 = 1만큼 감소하지 않은 상태 10 + 2 = 12
		System.out.println("d = " + d); // --가ㅡ앞에 붙든 뒤에 붙든 d값은 1만큼 감소함(d = 9)
	}

}
