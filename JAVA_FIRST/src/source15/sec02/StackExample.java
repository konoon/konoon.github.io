package source15.sec02;

import java.util.Stack;

// Stack을 이용한 동전 케이스
public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전 객체를 생성해서 push 메서드로 coinBox 안에 넣어줌
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// isEmpty()는 데이터가 없을때를 의미
		while (!coinBox.isEmpty()) { // 동전 케이스가 비어있는지 확인해서
			Coin coin = coinBox.pop(); // 동전 케이스에서 제일 위에 있는 동전을 꺼냄
			System.out.println("동전 케이스에서 꺼낸 동전 = " + coin.getValue() + "원");
		}
	}

}
