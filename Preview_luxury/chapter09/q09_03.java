package chapter09;

import java.awt.*;
import javax.swing.*;

public class q09_03 extends JFrame{
	q09_03(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		grid.setVgap(1);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JButton("0"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new q09_03();
	}
}