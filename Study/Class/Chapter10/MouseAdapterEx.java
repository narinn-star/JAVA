package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame {
	JLabel label = new JLabel("Hello");
	public MouseAdapterEx() {
		super("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
		label.setLocation(30, 30);
		label.setSize(50, 20);
		c.add(label);
		
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}