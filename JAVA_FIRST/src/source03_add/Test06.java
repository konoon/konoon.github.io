package source03_add;

public class Test06 {

	public static void main(String[] args) {
		int a = 100, b = 200;
		
		// %d = decimal(10진수 정수), %s = string(문자열)
		System.out.printf("%d == %d 는 %s 이다. \n", a, b, a == b);
		System.out.printf("%d != %d 는 %s 이다. \n", a, b, a != b);
		System.out.printf("%d > %d 는 %s 이다. \n", a, b, a > b);
		System.out.printf("%d < %d 는 %s 이다. \n", a, b, a < b);
		System.out.printf("%d >= %d 는 %s 이다. \n", a, b, a >= b);
		System.out.printf("%d <= %d 는 %s 이다. \n", a, b, a <= b);
	}

}
