package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Ten_Color_Buttons_Frames extends JFrame {
	public Ten_Color_Buttons_Frames() {
		super("Ten_Color_Buttons_Frames");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 4);
		c.setLayout(grid);
		
		Color[] color = { Color.red, Color.orange, Color.yellow, Color.green,
				Color.cyan, Color.blue, Color.magenta, Color.DARK_GRAY, Color.pink, Color.LIGHT_GRAY,
				Color.red, Color.orange, Color.yellow, Color.GREEN, Color.cyan, Color.blue };
		
		for(int i = 0; i < 16; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setBackground(color[i]);
			label.setOpaque(true);
			c.add(label);
		}
		
		setSize(800, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ten_Color_Buttons_Frames();
	}
}