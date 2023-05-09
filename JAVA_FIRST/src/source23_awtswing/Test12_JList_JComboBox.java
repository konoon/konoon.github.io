package source23_awtswing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test12_JList_JComboBox {

	static class MyGUI extends JFrame{
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());
			
			// 리스트에 출력할 문자열 배열을 준비합니다.
			String [] pet = {"고양이", "강아지", "고슴도치", "거북이", "앵무새"};
			
			JList<String> list = new JList<String>(pet);
			this.add(list);
			
			JComboBox<String> combo = new JComboBox<String>(pet);
			this.add(combo);

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
