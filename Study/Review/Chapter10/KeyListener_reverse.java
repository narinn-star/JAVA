package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyListener_reverse extends JFrame {
	JLabel label = new JLabel("Love Java");
	StringBuffer sb = new StringBuffer("Love Java");
	public KeyListener_reverse() {
		super("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(label);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					sb.reverse();
					label.setText(sb.toString());
				}
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyListener_reverse();
	}
}