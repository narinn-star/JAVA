package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Ten_Color_Buttons_Frame extends JFrame {
	public Ten_Color_Buttons_Frame() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		Color[] color = {Color.red, Color.orange, Color.yellow, Color.green,
				Color.cyan, Color.blue, Color.magenta, Color.DARK_GRAY, Color.pink, Color.LIGHT_GRAY
		};
		
		for(int i = 0; i < 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setBackground(color[i]);
			c.add(btn);
		}
		
		setSize(500, 200);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new Ten_Color_Buttons_Frame();
	}
}