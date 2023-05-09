package source23_awtswing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

// 버튼이 눌리면, 버튼 상태가 변하는 이벤트 처리를 하는 자바 프로그램 제작

public class Test13_ActionListener {

	static class MyGUI extends JFrame{
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("버튼1");
			
			// 버튼1이 눌리는 Action 이벤트가 일어났을 때 작동하는 리스너를 정의합니다.
			// 실제 작동하는 부분은 actionPerformed() 메서드이므로
			// 다음의 버튼1이 자신의 색상을 붉은색으로 변경 처리 합니다.
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 버튼1이 자신의 색상을 붉은색으로 변경 처리합니다.
					btn1.setBackground(Color.RED);
				}
			});
			this.add(btn1);
			
			
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 230, 500);
			
			// 화면에 프레임이 나타나도록 설정함	
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
