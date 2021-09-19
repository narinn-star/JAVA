package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Random_Labels extends JFrame {
	public Random_Labels() {
		super("Rando_Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 20; i++) {
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			
			JLabel label = new JLabel((int)(Math.random() * 100) + "");
			
			label.setLocation(x, y);
			label.setBackground(Color.red);
			label.setSize(20, 20);
			label.setOpaque(true);
			c.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Random_Labels();
	}
}