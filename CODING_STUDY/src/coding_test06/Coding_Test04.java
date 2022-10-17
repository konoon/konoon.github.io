package coding_test06;

import java.util.Stack;

// Stack 클래스는 LIFO 자료구조를 구현한 클래스입니다.
// 문제 : 동전 케이스를 Stack 클래스로 구현하는
// 자바 프로그램을 작성해 봅니다.
// 이때, 동전 케이스는 위에만 열려 있는 스택 구조를
// 가지고 있습니다. 먼저 넣은 동전은 제일 밑에 깔리고
// 나중에 넣은 동전이 위에 쌓이기 때문에
// Stack에서 동전을 빼면 마지막에 넣은 동전이
// 먼저 나오게, 다음의 실행 결과와 같이 구현되도록
// 자바 프로그램을 작성합니다.
// 실행 결과
// 동전 케이스에서 꺼낸 동전 = 10원
// 동전 케이스에서 꺼낸 동전 = 500원
// 동전 케이스에서 꺼낸 동전 = 50원
// 동전 케이스에서 꺼낸 동전 = 100원

// 동전 클래스 작성(동전 객체 생성)
class Coin{
	private int value;

	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}

// Stack을 이용한 동전 케이스
public class Coding_Test04{
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		// 동전 객체를 생성해서 push 메서드로 coinBox 안에 넣어줌
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));  // 제일 마지막에 들어감
		
		// 동전 케이스가 비어 있는지 확인해 봅니다.
		// 동전 케이스가 비어 있지 않다면
		while (!coinBox.isEmpty()) {
			// 동전 케이스에서 제일 위에 있는 동전 객체를 꺼내 줍니다.
			Coin coin = coinBox.pop();
			System.out.println("동전 케이스에서 꺼낸 동전 = " + coin.getValue() + "원");
		}
	}
}
