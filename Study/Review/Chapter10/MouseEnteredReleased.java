package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEnteredReleased extends JFrame {
	JLabel label = new JLabel("사랑해");
	
	public MouseEnteredReleased() {
		super("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("사랑해");
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEnteredReleased();
	}
}