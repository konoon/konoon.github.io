package source15.sec02;

import java.util.LinkedList;
import java.util.Queue;

// Queue를 이용한 메시지 큐 실행 클래스 제작

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메시지를 offer 메서드 활용 Queue 인터페이스 자료 구조에 넣어줌
		messageQueue.offer(new Message("sendMail", "장나라"));
		messageQueue.offer(new Message("sendSMS", "김희선"));
		messageQueue.offer(new Message("sendKakaotalk", "이영애"));
		
		while (!messageQueue.isEmpty()) { // 메시지 큐가 비어 있는지 확인함
			// 메시지 큐에서 메시지를 poll() 메서드를 활용하여 꺼내옴
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;

			}
			
		}
	}

}
