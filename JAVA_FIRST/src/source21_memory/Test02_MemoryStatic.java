package source21_memory;

public class Test02_MemoryStatic {

	static int num1; // 정적 static 멤버 변수 선언: 초기화 안해도 기본적으로 0으로 초기화됨
	int num2; // 인스턴스형 멤버 변수(객체 변수) 선언
	
	// static 정적 메서드 활용: printNum()
	static void printNum() {
		System.out.println("num1 = " + num1); // 정상 출력
		// System.out.println("num2 = " + num2); // 오류 발생
	}
	
	void printNum2() { // 인스턴스형 메서드 활용: printNum2()
		System.out.println("num1 = " + num1); // 정상 출력
		System.out.println("num2 = " + num2); // 정상 출력
	}
	
	public static void main(String[] args) {
		// 앞서 static void printNum()에서 초기화 안해도 기본적으로 0으로 초기화가 됨
		// 그래서 num1은 0이 나타남 
		Test02_MemoryStatic.printNum();
		
		num1 = 10; // static int형의 num1 변수에 값을 10으로 대입(할당) 처리함
		
		System.out.println("num1 = " + num1);
		
		printNum();
		
		Test02_MemoryStatic ms;
		ms = new Test02_MemoryStatic();
		
		ms.num2 = 20;
		System.out.println(ms.num2);
		ms.printNum2();
		
	}
}
