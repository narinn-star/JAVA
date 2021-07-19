package chapter11;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.jpg");
		
		JButton btn = new JButton("call !!", normalIcon);
		//btn.setHorizontalAlignment(SwingConstants.LEFT); // ��ư �ȿ��� �̹����� ���ڿ��� ���� ���� (LEFT, CENTER, RIGHT)
		//btn.setVerticalAlignment(SwingConstants.TOP); // ��ư �ȿ��� �̹����� ���ڿ��� ���� ���� (TOP, CENTER, BOTTOM)
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}