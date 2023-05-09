package source20_versionup;

public class CalculatorTest_Java9 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(num1, num2));
		
		calc.printDefault();
		
		System.out.println(calc.ERROR);
		System.out.println(calc.PI);
		
		Carc.print();

		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Carc.total(arr));
		
	}

}
