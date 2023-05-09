package source07_add;

public class Test09 {

	public static void main(String[] args) {
		
		// char형 stack 배열에 5개의 메모리 공간을 할당함
		char[] stack = new char[5];
		int top = 0; // top의 초깃값 0을 선언함
		
		stack[top] = 'A'; // 스택에 값을 넣은 후 top 값을 1 증가 시킴
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'B'; // 스택에 값을 넣은 후 top 값을 1 증가 시킴
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		stack[top] = 'C'; // 스택에 값을 넣은 후 top 값을 1 증가 시킴
		System.out.printf("%c 자동차가 터널에 들어감\n", stack[top]);
		top++;
		
		System.out.println("========================");
		
		top--; // top값을 1씩 줄이면서 스택에서 값을 하나씩 빼냅니다.
		System.out.printf("%c 자동차가 터널을 빠져나감 \n", stack[top]);
		stack[top] = ' ';
	}

}
