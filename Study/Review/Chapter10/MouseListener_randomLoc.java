package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListener_randomLoc extends JFrame {
	public MouseListener_randomLoc() {
		super("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel C = new JLabel("C");
		C.setSize(10, 10);
		C.setLocation(100, 100);
		c.add(C);
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*350);
				int y = (int)(Math.random()*350);
				C.setLocation(x, y);
			}
		});

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListener_randomLoc();
	}
}