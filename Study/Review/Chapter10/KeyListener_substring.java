package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyListener_substring extends JFrame {
	static String text = "Love Java";

	public KeyListener_substring() {
		super("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel(text);

		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_LEFT) {
					String s = text.substring(1) + text.substring(0, 1);
					label.setText(text);
					text = s;
				}
			}
		});
		
		label.setFocusable(true);
		label.requestFocus();

		c.add(label);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyListener_substring();
	}
}