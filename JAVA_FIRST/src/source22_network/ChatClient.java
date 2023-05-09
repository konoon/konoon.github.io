package source22_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {

		int port = 5005; // 포트 번호를 5005번으로 설정함
		String server_ip, str;
		try {
			// PrintStream 객체를 생성함
			PrintStream ps = new PrintStream(System.out);
			
			// 사용자로부터 문자열을 입력 받기 위해 BufferedReader 객체 br을 생성함.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			ps.print("접속할 서버 아이피 = ");
			server_ip = br.readLine(); // 서버의 IP 주소를 입력 받음
			ps.print("전송할 메시지 = ");
			str = br.readLine(); // 전송할 문자열을 입력 받음
			
			// Socket을 생성해 서버와 연결을 시도함
			Socket client = new Socket(server_ip, port);
			// 클라이언트의 출력 스트림을 생성함
			OutputStream os = client.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			// write() 메서드를 이용해서 서버에게 데이터를 전송함
			bw.write(str, 0, str.length());
			bw.flush();
			bw.close();
			client.close();
			ps.print(server_ip + " 서버에 메시지 전송 성공!");
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
