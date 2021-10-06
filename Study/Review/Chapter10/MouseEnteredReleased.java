package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEnteredReleased extends JFrame {
	JLabel label = new JLabel("�����");
	
	public MouseEnteredReleased() {
		super("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("�����");
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEnteredReleased();
	}
}