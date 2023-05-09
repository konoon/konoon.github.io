package source23_awtswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test07_JComponent {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// 페인(pane)을 getContentPane() 메서드로 구현합니다.
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());
			
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 500, 500);
			
			// 버튼1의 배경색을 검정색으로, 전경색(글자색)은 연분홍색으로 설정합니다.
			JButton btn1 = new JButton("버튼1");
			btn1.setBackground(Color.BLACK);
			btn1.setForeground(Color.MAGENTA);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			
			// 버튼2의 폰트는 맑은 고딕, 볼드체로 하고, 크기는 30으로 설정합니다.
			btn2.setFont(new Font("맑은고딕", Font.BOLD, 30));
			// 버튼2 위에 마우스 커서를 놓으면 회전 모양의 커서(WAIT_CURSOR)로 변경되도록 설정합니다. 
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			// 버튼2 위에 마우스 커서를 올려 놓으면 툴팁이 화면에 표시되도록 설정합니다.
			btn2.setToolTipText("이 버튼은 크게 보입니다~~~!");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			// 버튼3은 사용하지 못하도록 비활성화 설정 합니다.
			btn3.setEnabled(false);
			this.add(btn3);
			
			// 화면에 프레임이 나타나도록 설정함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
