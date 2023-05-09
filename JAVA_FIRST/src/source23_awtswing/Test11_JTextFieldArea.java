package source23_awtswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test11_JTextFieldArea {
	static class MYGUI extends JFrame {
		public MYGUI() {
			// 엑스버튼 누르면 종료되도록
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// 윈도우의 제목을 출력하는데, 이것은 생략 가능
			setTitle("GUI");
			// FlowLayout (정렬방식, 수평간격, 수직간격)
			this.setLayout(new FlowLayout());
			
//			JTextField txt1 = new JTextField(10);
//			this.add(txt1);
//			
//			JTextArea txt2 = new JTextArea(5, 10);
//			this.add(txt2);
//			
//			this.add(new JScrollPane(txt2));
//			
//			JPasswordField txt3 = new JPasswordField(10);
//			this.add(txt3);
			
			String [] pet = {"고양이", "고양이", "고양이", "고양이", "고양이"};
			JList<String> list = new JList<String>(pet);
			this.add(list);
			
			JComboBox<String> combo = new JComboBox<String>(pet);
			this.add(combo);
			
			setBounds(900, 300, 230, 500);
			
			// 화면에  프레임이 나타나도록 설정함
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MYGUI();
	}
}
