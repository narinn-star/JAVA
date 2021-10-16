package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		super("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rollOverIcon.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.jpg");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}