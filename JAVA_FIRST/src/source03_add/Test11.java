package source03_add;

public class Test11 {

	public static void main(String[] args) {
		int a = 2, b = 3, c = 4;
		int result1, mok, namugi;
		float result2;
		
		result1 = a + b - c;
		System.out.println(result1);
		
		result1 = a + b * c;
		System.out.println(result1);
		
		result1 = (a + b) * c;
		System.out.println(result1);
		
		result2 = a * b / (float)c;
		System.out.println(result2);
		
		mok = c / b;
		System.out.println(mok);
		
		namugi = c % b;
		System.out.println(namugi);
	}

}
