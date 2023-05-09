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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Test09_JComponent2 {

	static class MyGUI extends JFrame{
		
		public MyGUI() {
			// Windows 오른쪽 위에 x버튼을 누르면 프로그램이 종료되게 합니다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Windows의 제목을 출력하는데, 이것은 생략이 가능합니다.
			setTitle("GUI 연습");
			
			// FlowLayout(정렬방식, 수평간격, 수직간격);
			this.setLayout(new FlowLayout());
			
			// setBounds(가로위치, 세로위치, 가로길이, 세로길이);
			setBounds(900, 300, 230, 500);
			
			// 이미지 인식 img 객체 생성
			ImageIcon img = new ImageIcon("c:/images/1.png");
			
			// 버튼에 이미지 나타나도록 설정합니다.
			JButton btn1 = new JButton(img);
			this.add(btn1);
			
			// 레이블에 문자, 이미지가 표현되도록 설정합니다.
			JLabel lbl1 = new JLabel("레이블 1입니다!");
			this.add(lbl1);
			JLabel lbl2 = new JLabel(img);
			this.add(lbl2);
			
			// 체크 박스 3개를 준비하고, 세 번째 체크 박스는 먼저 체크가 되어 있도록
			// true로 설정합니다.
			JCheckBox chk1 = new JCheckBox("미국");
			JCheckBox chk2 = new JCheckBox("중국");
			// JCheckBox 객체 생성 시 true 옵션을 붙여주면
			// 체크 박스에 체크가 미리 설정되도록 할 수 있습니다.
			JCheckBox chk3 = new JCheckBox("한국", true);
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);
			
			// 버튼 그룹을 준비하고 라디오 버튼 3개를 버튼 그룹에 포함합니다.
			JRadioButton rdo1 = new JRadioButton("하늘");
			JRadioButton rdo2 = new JRadioButton("땅");
			JRadioButton rdo3 = new JRadioButton("바다");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			
			// 다음의 버튼 그룹을 적용하지 않으면 라디오버튼으로 중복 체크가 가능합니다.
			// 버튼 그룹 적용 시 라디오 버튼에서 중복 체크가 안됩니다.
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			
			// 화면에 프레임이 나타나도록 설정함	
			setVisible(true);
		}
	}

	public static void main(String[] args) {
			new MyGUI();
	}

}
