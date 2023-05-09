package source03;

public class Test05_LogicalOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 1;
		
		if((num1 > num2) && (num3 < num4)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

		// 둘중 하나가 참이어도 참으로 나옴		
		if((num1 < num2) || (num3 > num4)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}

}
