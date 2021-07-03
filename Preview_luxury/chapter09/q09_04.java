package chapter09;

import javax.swing.*;
import java.awt.*;

public class q09_04 extends JFrame{
	q09_04(){
		setTitle("Then Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 10);
		grid.setVgap(1);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JButton("0")).setBackground(Color.RED);
		c.add(new JButton("1")).setBackground(Color.ORANGE);
		c.add(new JButton("2")).setBackground(Color.YELLOW);
		c.add(new JButton("3")).setBackground(Color.GREEN);
		c.add(new JButton("4")).setBackground(Color.BLUE);
		c.add(new JButton("5")).setBackground(Color.MAGENTA);
		c.add(new JButton("6")).setBackground(Color.DARK_GRAY);
		c.add(new JButton("7")).setBackground(Color.PINK);
		c.add(new JButton("8")).setBackground(Color.LIGHT_GRAY);
		c.add(new JButton("9")).setBackground(Color.CYAN);
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new q09_04();
	}

}
