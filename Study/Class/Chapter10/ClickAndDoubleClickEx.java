package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {
		super("Click and DoubleClick ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component c = (Component)e.getSource();
				if(e.getClickCount() % 2 == 0) {
					int r = (int)(Math.random() * 256);
					int g = (int)(Math.random() * 256);
					int b = (int)(Math.random() * 256);
					c.setBackground(new Color(r,g,b));
				}
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}