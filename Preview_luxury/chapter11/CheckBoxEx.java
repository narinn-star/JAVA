package chapter11;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리",cherryIcon);
		
		cherry.setBorderPainted(true); //체크박스 외곽선 보이게 설정
		cherry.setSelectedIcon(selectedCherryIcon); //선택 상태 이미지 등록
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}