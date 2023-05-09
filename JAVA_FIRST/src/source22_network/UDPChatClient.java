package source22_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPChatClient {

	public static void main(String[] args) {
		// UDP 채팅 서버 포트 설정함
		int port = 5005;
		
		String sever_ip, str;
		try {
			// 클라이언트 애플리케이션 화면 표시에 활용할 ps 객체 생성
			PrintStream ps = new PrintStream(System.out);
			// 문지열을 입력 받기 위해 BufferedReader 객체 br 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ps.print("접속할 서버 아이피 = ");
			// 사용자로부터 키보드로 접속할 서버의 IP주소를 입력 받아서 sever_ip 변수에 대입
			sever_ip = br.readLine();
			ps.print("전송할 메시지 = ");
			// 사용자로부터 키보드로 입력 받은 문자열 데이터를 str 변수에 대입
			str = br.readLine();
			
			// 클라이언트 측 DatagramSocket 객체를 생성함
			DatagramSocket ds = new DatagramSocket();
			// sever_ip 번호를 이용해서 InetAddress 객체를 생성
			InetAddress addr = InetAddress.getByName(sever_ip);
			// 문자열을 string 클래스의 getBytes() 메서드를 이용해서  byte배열로 변환 처리함
			byte buffer[] = str.getBytes();
			
			// 클라이언트 측 DatagramSocket 객체를 생성함
			// UDP 방식은 데이터를 byte 단위의 패킷(데이터 최소 전송단위)으로 전송 처리 함
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, addr, port);
			// DatagramSocket 클래스의 send() 메서드를 이용해서 데이터를 서버에 전송함
			ds.send(dp);
			
			ps.print(sever_ip + "서버에 메시지 전송 성공");
			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
