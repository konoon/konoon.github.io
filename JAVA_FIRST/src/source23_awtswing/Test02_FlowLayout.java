package source23_awtswing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test02_FlowLayout {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 500, 500);
			
			JButton btn1 = new JButton("버튼1");
			this.add(new JButton("버튼1"));
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);
			
			JButton btn4 = new JButton("버튼4");
			this.add(btn4);
			
			JButton btn5 = new JButton("버튼5");
			this.add(btn5);
			
			
			
			// 화면에 프레임이 나타나도록 설정함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
