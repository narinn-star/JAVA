package Chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dragging_Color extends JFrame {
	public Dragging_Color() {
		super("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setBackground(Color.green);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				c.setBackground(Color.yellow);
			}

			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.green);
			}
		});
		
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Dragging_Color();
	}
}