package source22_network;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

// ChatHandle 클래스 : 채팅 서버의 실질적인 처리 역할 담당
class ChatHandle extends Thread{  // ChatHandle 클래스 Thread 상속 처리
	GUIChatServer server = null;  // GUIChatServer 멤버 변수 필드를 null로 초기화
	Socket client = null; // 접속한 클라이언트 client 필드를 null로 초기화
	BufferedReader br = null; // 데이터 읽어오는 br 필드를 null로 초기화
	PrintWriter pw = null; // 데이터 기록을 위한 pw 필드를 null로 초기화
	
	public ChatHandle(GUIChatServer server, Socket client) throws IOException {
		this.server = server;
		this.client = client;
		
		// 입출력 스트림 생성
		InputStream is = client.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));
		OutputStream os = client.getOutputStream();
		pw = new PrintWriter(new OutputStreamWriter(os));
	}
	
	// 현재 서버에 접속한 모든 클라이언트에 msg 전송
	public void Send_All(String msg) {
		try {
			// GUIChatServer 멤버 변수 list 동기화 처리
			synchronized (server.list) {
				int size = server.list.size(); // 현재 접속한 클라이언트 수
				for (int i = 0; i < size; i++) {
					ChatHandle chs = (ChatHandle) server.list.elementAt(i);
					// ChatHandel pw 인스턴스를 이용한 문자 전송
					synchronized (chs.pw) {
						chs.pw.println(msg);
					}
					chs.pw.flush();					
				}
			}			
		  // 예외 처리	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Thread 클래스의 run 메서드 오버라이딩
	@Override
	public void run() {
		String name = "";
		
		try {
			name = br.readLine(); // 대화면 읽어 오기
			Send_All(name + "님이 새로 입장하셨습니다!");
			
			while (true) {
				// 클라이언트 메시지를 msg 변수에 대입해줌
				String msg = br.readLine(); 
				String str = client.getInetAddress().getHostName();
				synchronized (server) {
					// 접속 클라이언트 메시지를 화면에 출력 표시함
					server.setMsg(str + " : " + msg);
				}
					// 현재 접속한 모든 클라이언트에 메시지 전송 처리함.
					Send_All(name + " → " + msg);
			}
			
		  // 예외 처리
		} catch (Exception e) {
			server.setMsg(e.getMessage());
		}
		finally {
				synchronized (server.list) {
					// 접속 목록에서 제거 처리함
					server.list.removeElement(this);
				}
				// 스트림 닫기
				try {
					br.close();
					pw.close();
					client.close(); // 클라이언트 접속 해지
				} catch (Exception e2) {  // 예외처리  
					server.setMsg(e2.getMessage());
				}
		}
	}
}

public class GUIChatServer extends Frame implements ActionListener {

		private static final String ChatHandle = null;
		Button btn_ext; // 종료 버튼
		TextArea txt_list; // 접속 목록 출력
		protected Vector list; // 접속한 서버 목록 저장
		
		public GUIChatServer(String title) {
			super(title); // 타이틀바에 출력될 문자열 설정
			list = new Vector(); // 백터 생성
			btn_ext = new Button("서버 종료"); // 서버 종료 버튼 생성
			btn_ext.addActionListener(this); // 이벤트 등록
			txt_list = new TextArea(); // txt_list 생성
			add("Center", txt_list);  // 화면 가운데 txt_list 출력 표현
			add("South", btn_ext); // 화면 하단에 서버 종료 버튼 표시
//			setSize(400, 300); // Frame 화면 크기 설정
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(300, 300, 400, 300);
			setVisible(true); // Frame이 화면에 나타나게 함.
			ServerStart();  // 채팅 서버 시작 메서드 호출 
		}
		
		// 채팅 서버 시작 메서드 정의
		public void ServerStart() {
			final int port = 5005; // 채팅 서버 포트를 상수로 지정함.
			
			try {
				// ServerSocket 생성(포트번호 5005 설정)
				ServerSocket ss = new ServerSocket(port);
				while (true) {
					// 클라인트 접속 대기함(기다림)
					Socket client = ss.accept();
					txt_list.appendText(client.getInetAddress().getHostAddress() + "\n");
					// ChatHandle 초기화
					ChatHandle ch = new ChatHandle(this, client);
					list.addElement(ch); // 클라이언트 관리 list 백터에 추가함
					ch.start();  // ChatHandle 스레드 시작
				}
			  // 예외 처리	설정
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		// 서버 종료 버튼이 눌렸을 때 : 서버 프로그램 닫기 실행
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		
		// 메시지 출력 메서드
		public void setMsg(String msg) {
			// 화면에 msg 메시지 출력 표시해 줌
			txt_list.appendText(msg + "\n");
		}

		// main 실행 함수
		public static void main(String[] args) {
			new GUIChatServer("채팅 서버");
	}
}


