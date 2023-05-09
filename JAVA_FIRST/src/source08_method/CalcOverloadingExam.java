package source08_method;

public class CalcOverloadingExam {

	public static void main(String[] args) {
		CalcOverloading myCalol = new CalcOverloading();
		
		// 정사각형 넓이 구하기
		double result1 = myCalol.areaRectangle(10);
		System.out.println("정사각형의 넓이 = " + result1);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalol.areaRectangle(3, 7);
		System.out.println("직사각형의 넓이 = " + result2);

	}

}
