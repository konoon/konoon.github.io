package source23_awtswing;

import javax.swing.JFrame;

public class Test01_JFrame {

	static class MyGUI extends JFrame{
		
		public MyGUI() {

				// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
				setTitle("GUI 연습");
				
				// Windows의 크기를 지정합니다. 가로 500, 세로 500 픽셀 크기로 지정합니다.
//				setSize(500, 500);
				
				// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
				setBounds(900, 300, 500, 500);
				
				setVisible(true);
				
		
		}
	}
	
	public static void main(String[] args) {

		new MyGUI();
		
	}

}
