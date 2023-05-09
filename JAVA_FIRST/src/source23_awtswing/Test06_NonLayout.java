package source23_awtswing;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test06_NonLayout {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			// 레이아웃이 없는 창 연습 : 레이아웃을 null값으로 초기화 설정합니다.
			this.setLayout(null);
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 500, 500);
			
			// 3개의 버튼을 배치합니다.
			JButton btn1 = new JButton("버튼1");			
			btn1.setBounds(50, 50, 70, 60);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");			
			btn2.setBounds(80, 80, 70, 60);
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");			
			btn3.setBounds(110, 110, 70, 60);
			this.add(btn3);
			
			// 화면에 프레임이 나타나도록 설정함
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
