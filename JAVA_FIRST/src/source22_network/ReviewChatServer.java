package source22_network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReviewChatServer {

	public static void main(String[] args) {
		// 채팅 서버 포트: 서버와 클라이언트간 통신은 반드시 포트 번호가 일치해야함
		int port = 5005;
		
		try {
			// ServerSocket 객체를 생성하고, 통신 포신포트를 설정 처리함
			ServerSocket ss = new ServerSocket(port);
			// 무한 루프를 돌면서 클라이언트의 문자를 수신 처리함
			while (true) {
				Socket client = ss.accept();
				InputStream is = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintStream ps = new PrintStream(System.out);
				ps.print(client.getInetAddress().getHostAddress());
				ps.print(": 클라이언트로부터 수신한 메시지 = " + br.readLine() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
