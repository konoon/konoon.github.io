package source08_review.methodex;

// 메서드 오버로딩: 메소드 시그니처는 메서드 이름과 매개변수의 개수, 데이터타입, 순서를 의미하며 메서드 이름은 같지만 메서드 시그니처가 다른 메서드를 정의 하는것

public class Test05 {
	public static void main(String[] args) {
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		
		System.out.printf("min(%d, %d) = %d\n", i1, i2, min(i1, i2));
		System.out.printf("min(%.1f, %.1f) = %.1f \n", d1, d2, min(d1, d2));
		System.out.printf("min(%d, %d, %d) = %d \n", i1, i2, i3, min(i1, i2, i3));
	}
	
	public static int min(int n1, int n2) {
		int result = (n1 < n2) ? n1 : n2;
		return result;
	}

	public static double min(double n1, double n2) {
		double result = (n1 < n2) ? n1 : n2;
		return result;
	}
	
	public static int min(int n1, int n2, int n3) {
		return min(min(n1, n2), n3);
	}

//	public static int max(int n1, int n2) {
//		int result = (n1 > n2) ? n1 : n2;
//		return result;
//	}
//
//	public static double max(double n1, double n2) {
//		double result = (n1 > n2) ? n1 : n2;
//		return result;
//	}
//	
//	public static int max(int n1, int n2, int n3) {
//		return max(max(n1, n2), n3);
//	}
	
}
