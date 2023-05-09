package source02_add;

public class Test01_SystemPrint {

	public static void main(String[] args) {
		
		String str1 = "hi";
		String str2 = "bye";
		
		System.out.print(str1 + "\n");
		System.out.println(str2);

		int value = 10000;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %7d원\n", value);
		System.out.printf("상품의 가격 : %-7d원\n", value);
		
		float floatValue = 10.3f;
		System.out.printf("소수점의 갑 : %10.3f\n", floatValue);
		System.out.printf("소수점의 갑 : %010.3f\n", floatValue);
		System.out.printf("소수점의 값 : %-10.3f\n", floatValue);
		
		String str = "장나라";
		System.out.printf("문자열 값 : %s\n", str);
		System.out.printf("문자열 값 : %10s\n", str);
		System.out.printf("문자열 값 : %-10s\n", str);
	}

}
