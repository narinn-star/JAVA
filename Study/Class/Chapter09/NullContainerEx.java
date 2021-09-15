package Chapter09;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setSize(200, 20);
		la.setLocation(130, 50);
		c.add(la);
		
		for(int i = 1; i < 10; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setLocation(15*i, 15*i);
			btn.setSize(50, 20);
			c.add(btn);
		}
			
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}
}