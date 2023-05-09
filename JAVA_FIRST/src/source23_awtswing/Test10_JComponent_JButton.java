package source23_awtswing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

// 버튼 위치를 사용자가 정의해서 설정 배치하는 자바 애플리케이션 프로그램 제작

public class Test10_JComponent_JButton {

	public static void main(String[] args) {

		// 프레임 생성
		JFrame frm = new JFrame("버튼 위치 설정");
		
		// 프레임 크기 설정
		frm.setSize(350, 300);
		
		// 프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		
		// 프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 설정 초기화
		frm.getContentPane().setLayout(null);
		
		// 버튼 생성
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.setBounds(30, 150, 122, 30);
		btn2.setBounds(182, 150, 122, 30);
		
		// 프레임에 버튼 추가
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);		
		
		// 프레임이 보이도록 설정함
		frm.setVisible(true);
	
	
	
	}

}
