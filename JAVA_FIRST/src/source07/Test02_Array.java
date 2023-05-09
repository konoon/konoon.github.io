package source07;

public class Test02_Array {

	public static void main(String[] args) {
		int[] numbers = {83, 80, 70};
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
		
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("배열 변수의 총합계 = " + sum);
	}
}
