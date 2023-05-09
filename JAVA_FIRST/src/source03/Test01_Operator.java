package source03;

public class Test01_Operator {

	public static void main(String[] args) {
		int x = 1;
		int y = 10;
		int z;
		
		int a = x++;
		int b = ++y;
		System.out.println(x);
		System.out.println(y);
		
//		z = a++;
//		System.out.println(z);
		z = ++b;
		System.out.println(b);
	}

}
