package source23_awtswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04_GridLayout {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			// GridLayout(행, 열, 수평간격, 수직간격);
			this.setLayout(new GridLayout(3, 3, 30, 50));
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 500, 500);
			
			// 9개짜리 JButton 배열을 만듭니다.
			JButton[] btn = new JButton[9];
			
			// 9개의 버튼 배열을 반복문으로 추가합니다.
			for (int i = 0; i < 9; i++) {
				btn[i] = new JButton("버튼" + (i+1));
				this.add(btn[i]);
			}
			
			// 화면에 프레임이 나타나도록 설정함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
