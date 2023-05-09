/* 함수 호출과 스택 메모리 구조 파악 예제
   스택 : 함수가 호출될 때 사용하는 메모리,
   함수가 호출된 후 수행이 끝나면 자동으로 반환되는 메모리 */
package debugex;

class DebugEx02_Func {
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

	public static void sayHello(String greeting) {
		System.out.println(greeting);
	} 

	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i <= 10; i++) {
			sum += i;
   		         // System.out.println(sum);
		} return sum; // 0부터 10까지 합계값 55가 담겨짐
	} 


	public static void main(String[] args) {
		int n1 = 10;  // (1) BreakPoint 찍어봄 : Step Over(F6), Step Into(F5) 실행해 봄
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕~ 장나라!");

		int num = calcSum();
		System.out.println(num);
	}
}

/* 실행 결과
30
안녕~ 장나라!
55
*/