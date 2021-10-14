package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyListener_Font extends JFrame {
	public KeyListener_Font() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(label);
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Font f = label.getFont();
				int size = f.getSize();

				if (e.getKeyCode() == KeyEvent.VK_ADD)
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				else if (e.getKeyCode() == KeyEvent.VK_MINUS && size > 5) {
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
		});

		label.setFocusable(true);
		label.requestFocus();

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyListener_Font();
	}
}