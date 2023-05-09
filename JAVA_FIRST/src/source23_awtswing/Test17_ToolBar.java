package source23_awtswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Test17_ToolBar {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("툴바 만들기");
			this.setLayout(new FlowLayout());
			
			// 툴바와 아이템으로 사용할 버튼을 3개 준비
			JToolBar toolBar = new JToolBar();
			
			JButton newItem = new JButton("새문서");
			JButton openItem = new JButton("열기");
			JButton closeItem = new JButton(new ImageIcon("C:\\images\\exit.png"));
			
			// 툴바를 JFrame에 부착 초기 툴바의 위치는 상단에 둠
			add(toolBar, BorderLayout.NORTH);
			toolBar.add(newItem);
			toolBar.add(openItem);
			toolBar.addSeparator();
			toolBar.add(closeItem);
			
			JLabel lbl = new JLabel("바뀜");
			this.add(lbl);
			
			openItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					lbl.setText("열기를 선택함");
					
				}
			});
			
			closeItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			setBounds(200, 200, 500, 500);
			setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		new MyGUI();
	}
}
