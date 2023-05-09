package source22_network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {

		// 채팅 서버 포트 : 서버와 클라이언트간 통신은 반드시 포트 번호가 일치해야 함
		int port = 5005; 
		
		try {   // ServerSocket 객체를 생성함
			ServerSocket ss = new ServerSocket(port);
			
			// 무한 루프를 돌면서 클라이언트의 문자를 수신함.
			while (true) {
				// accept() 메서드를 이용해 접속한 클라이언트 소켓을 받아옴
				Socket client = ss.accept();
				
				// 서버에 접속한 클라이언트에서 줄 단위로 문자열을 받아오기 위해
				// BufferedReader 객체 br을 생성함.
				InputStream is = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				// 화면에 문자열을 출력하기 위해 PrintStream 객체를 생성함.
				// 참고로, 원래 System.out.println()으로 화면 출력해야 하지만,
				// 자주 사용되는 메소드이기 때문에 JVM 안에 자동으로 사용할 수 있도록
				// 구현되어 있음.
				PrintStream ps = new PrintStream(System.out);
				// 접속한 클라이언트의 IP 주소를 출력함
				ps.print(client.getInetAddress().getHostAddress());
				// 클라이언트가 전송한 문자열을 화면에 출력함
				ps.print(" : 클라이언트로부터 수신한 메시지 = " + br.readLine());
//				br.close();
//				ps.close();
//				client.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
