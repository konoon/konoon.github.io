package source23_awtswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import source23_awtswing.Test15_KeyListene.MyGUI;

public class Test16_MenuBar {

	static class MyGUI extends JFrame {
		public MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴 만들기");
			this.setLayout(new FlowLayout());
			
			JLabel lbl = new JLabel("여기가 바뀜");
			this.add(lbl);
			
			JMenuBar menuBar = new JMenuBar();
			JMenu fileMenu = new JMenu("파일");
			JMenuItem newItem = new JMenuItem("새문서");
			JMenuItem openItem = new JMenuItem("열기문서");
			JMenuItem closeItem = new JMenuItem("닫는문서");
			
			setJMenuBar(menuBar);
			
			menuBar.add(fileMenu);
			
			fileMenu.add(newItem);
			fileMenu.add(openItem);
			fileMenu.addSeparator(); // 구분선 적용
			fileMenu.add(closeItem);
			
			newItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					lbl.setText("새문서를 선택함");
				}
			});
			
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
