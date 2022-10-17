package coding_test06;

import java.util.LinkedList;
import java.util.Queue;

// Queue 인터페이스는 FIFO 자료구조에서 사용되는
// 메서드를 정의하고 있습니다.
// 문제 : Queue 인터페이스와 linkedList 클래스를 이용해서
// 간단한 메시지 큐를 구현하는 자바 프로그램을 제작해 보시기 바랍니다.
// 먼저 넣은 메시지가 반대쪽으로 먼저 나오게 하는 형식으로
// 다음의 실행 결과와 같이 넣은 순서대로
// 메시지가 처리되게 합니다.
// 실행 결과
// 장나라님에게 메일을 보냅니다!
// 김희선님에게 SMS를 보냅니다!
// 이영애님에게 카카오톡을 보냅니다!

// Message 클래스 생성(Message 객체 생성)
class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}

// Queue를 이용한 메시지 큐 실행 클래스 제작
public class Coding_Test05{
	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<>();
		
		// Message 객체를 생성해서 offer 메서드 활용
		// Queue 인터페이스 자료 구조에 넣어줌.
		messagesQueue.offer(new Message("sendMail", "장나라"));
		messagesQueue.offer(new Message("sendSMS", "김희선"));
		messagesQueue.offer(new Message("sendkakao", "이영애"));
		
		// messagesQueue가 비어 있는지 확인함
		// messagesQueue가 비어 있지 않다면
		while (!messagesQueue.isEmpty()) {
			// 메시지 큐에서 메시지를 poll() 메서드를 활용하여 꺼내옴
			Message message = messagesQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
				
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			
			case "sendkakao":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;

			}
		}
	}
}
