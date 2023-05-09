package source23_awtswing;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test06_NoneLayout {
	static class MYGUI extends JFrame {
		public MYGUI() {
			// 엑스버튼 누르면 종료되도록
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// 윈도우의 제목을 출력하는데, 이것은 생략 가능
			setTitle("GUI");
			
			// NoneLayout (정렬방식, 수평간격, 수직간격)
			this.setLayout(new CardLayout(10, 10));
			
			setBounds(900, 300, 500, 500);
			
			JButton btn1 = new JButton("버튼1");
			btn1.setBounds(50, 50, 70, 60);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			btn1.setBounds(80, 80, 70, 60);
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			btn1.setBounds(110, 110, 70, 60);
			this.add(btn3);
			
			// 화면에  프레임이 나타나도록 설정함
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MYGUI();
	}
}
