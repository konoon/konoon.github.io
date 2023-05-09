package source21_memory;

public class Test01_MemoryVar {

	// (1) 전역변수(globalVar, 객체변수, 인스턴스변수): 같은 클래스에서 호출이 가능함
	// 객체 변수는 클래스 영역에서 선언되며, 클래스의 객체를 생성할 때 만들어지고, 객체화를 시켜서 호출해야지만 사용이 가능함
	int globalVar = 7;
	
	// (2) 전역변수(클래스 변수, static 정적 변수): 다른 클래스에서도 호출 사용이 가능함.
	// 객체화를 시키지 않고도 사용이 가능하며, 객체변수가 객체화 시킬때마다 서로 다른 물리적 저장공간을 가지는 반면, 클래스 변수는 여러번
	// 객체화 시켜도 공통적인 물리적 저장공간을 가지게 됨
	static int globalStatic = 12;
	
	public static void main(String[] args) {
		
		int globalvar = 21;
		
		System.out.println("global 전역 변수 선언 및 변수값 확인");
		Test01_MemoryVar gvar = new Test01_MemoryVar();
		System.out.println(gvar.globalVar);
		System.out.println(globalvar);
		
		System.out.println("2. static 전역 변수 선언 및 변수값 확인");
		// static 전역 변수는 객체화 시키지 않고도 사용가능하며, 공통적인 물리적 메모리 저장 공간을 갖게 됨
		System.out.println(globalStatic);
		
		System.out.println("3. 변수 선언: 첫번째 방법 = 변수명 선언 후 초기화");
		int num;
		
		// 변수의 초기화: int num 변수가 생성된 스택 메모리에 최초의 값을 할당함
		num = 5;
		System.out.println(num);
		
		System.out.println("4. 변수 선언: 두번째 방법 = 선언과 동시에 초기화");
		int intNum = 15;
		String str = "Jangnara";
		System.out.println(intNum + ", " + str);
		
		System.out.println("5. 변수 선언: 세번째 방법 = 동시에 같은 타입(int 예시)의 변수 여러개 선언");
		// 같은 타입(int 예시)의 변수를 여러개 선언 가능하며, 콤마문자로 구분함. 이때도 변수의 선언과 동시에 초기화 가능
		int s1num = 10, s2num = 20, s3num = 30;
		System.out.println(s1num + ", " + s2num + ", " + s3num);
	}
}
