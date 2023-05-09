package source22_network;

import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPChatServer {

	public static void main(String[] args) {
		// UDP 채팅 서버 포트 설정함
		int port = 5005;
		
		// 데이터를 전송할 버퍼 크기를 50으로 지정함
		// UDP 소켓은 데이터를 패킷 단위로 전송하는데 이 패킷의 크기를 지정할 수 있음
		final int BUFFER = 50;
		// byte형 buffer 배열을 생성함
		byte buffer[] = new byte[BUFFER];
		String message = null;
		
		// 문자열 출력을 위한 PrintStream 생성
		PrintStream ps = new PrintStream(System.out);
		
		try {
			// DatagramSocket의 객체 ds를 생성함
			DatagramSocket ds = new DatagramSocket(port);
			// 무한 루프를 돌리며 클라이언트의 접속을 대기함(기다림)
			while (true) {
				// DatagramPacket 객체 dp를 생성함
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				// receive() 메서드를 이용해서 클라이언트 접속을 처리하며, 클라이언트 접속 메시지가 발생할 때까지 대기함
				ds.receive(dp);
				// 만약 위의 과정에서 클라이언트가 접속한다면 다음의 getData() 메서드를 이용해서 문자열을 수신해서 message 변수에 대입
				message = new String(dp.getData(), 0, dp.getLength());
				// 수신된 문자열 message 데이터를 화면으로 출력 표시함
				ps.print("수신 메시지 = " + message + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
