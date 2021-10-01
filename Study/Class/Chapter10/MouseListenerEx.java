package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	JLabel label = new JLabel("Hello");
	public MouseListenerEx() {
		super("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);				
			}
			
			public void mouseClicked(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		label.setSize(50, 20);
		label.setLocation(30, 30);
		c.add(label);
		
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
