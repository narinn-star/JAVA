package chapter09;

import javax.swing.*;
import java.awt.*;

public class q09_05 extends JFrame{
	q09_05(){
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		grid.setVgap(0);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i = 0; i<16; i++) {
			Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
					Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
					Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
			JLabel l = new JLabel(i+"");
			l.setBackground(color[i]);
			l.setOpaque(true);
			c.add(l);
		}
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new q09_05();
	}
}