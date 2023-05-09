package source08_method;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(30, 20);
		System.out.println("덧셈 메서드 결과 = " + result1);
		
		int result3 = myCalc.subtract(50, 20);
		System.out.println("뺄셈 메서드 결과 = " + result3);
		
		int result4 = myCalc.mutiplication(3, 7);
		System.out.println("곱셈 메서드 결과 = " + result4);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("나눗셈 메서드 결과 = " + result2);
		
		myCalc.powerOff();
	}

}
