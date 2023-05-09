package source08_method;

public class CalcStaticExam {

	public static void main(String[] args) {
		
		CalcStatic cs1 = new CalcStatic();
		System.out.println(cs1.field1);
		cs1.method1();
		
		
		double result1 = 10 * 10 * CalcStatic.PI;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	}

}
