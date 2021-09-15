package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Ten_Buttons_Frame extends JFrame {
	public Ten_Buttons_Frame() {
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(0, 10);
		c.setLayout(grid);
		
		for(int i = 0; i < 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setSize(50, 10);
			c.add(btn);
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ten_Buttons_Frame();
	}
}