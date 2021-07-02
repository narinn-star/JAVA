package chapter09;

import javax.swing.*;
import java.awt.*;

public class q09_02 extends JFrame{
	q09_02(){
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q09_02();
	}
}