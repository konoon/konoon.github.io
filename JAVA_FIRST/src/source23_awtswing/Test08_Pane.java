package source23_awtswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.FontUIResource;

public class Test08_Pane {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// pane : 창유리, (네모의) 한 구획
			// 페인(pane)을 getContentPane() 메서드로 구현합니다.
			// JFrame(=this)의 getContentPane() 메서드를 추출 사용합니다.
			Container c = this.getContentPane();
			c.setBackground(Color.GREEN);
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());
			
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 500, 500);
			
			JButton btn1 = new JButton("버튼1");
			this.add(btn1).setBackground(Color.BLUE);
			
			btn1.setFont(new Font("맑은고딕", Font.BOLD, 20));
			btn1.setForeground(Color.WHITE);
			btn1.setToolTipText("버튼1 입니다~");
			
			// 화면에 프레임이 나타나도록 설정함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
