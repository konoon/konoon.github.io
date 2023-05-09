package source08_review;

class Test02 {
	
	static int a = 10;
	
	
	public static void main(String[] args) {
		int b = 20;
		for(int i = 0; i < 10; i++) {
			System.out.println(a + i + b);
			System.out.println("정적 static 변수  : a의 " + a + "값 적용");
		}
	}
}
