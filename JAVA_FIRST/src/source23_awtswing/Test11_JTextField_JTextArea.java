package source23_awtswing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test11_JTextField_JTextArea {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());

			// 한 줄을 입력하기 위한 텍스트 필드(Field)를 준비합니다.
			// 10은 초기의 열 크기를 나타냅니다.
			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			
			// 여러 줄을 입력하기 위한 텍스트 영역(Area)을 준비합니다.
			// 5는 행의 수, 10은 열의 수를 나타냅니다.
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			
			// 텍스트 영역에 스크롤바를 부착합니다.
			// 입력하는 행이 5가 넘으면 스크롤바가 표시되도록 합니다.
			this.add(new JScrollPane(txt2));
			
			// 한 줄을 입력하지만 입력 내용이 보이지 않는 비밀번호 필드를 준비합니다.
			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);
			
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
