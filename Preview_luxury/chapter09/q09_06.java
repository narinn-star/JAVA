package chapter09;

import javax.swing.*;
import java.awt.*;

public class q09_06 extends JFrame{
	q09_06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		
		for(int i = 0; i<20; i++) {
			int x = (int)(Math.random()*200) + 50; // 50 ~ 250
			int y = (int)(Math.random()*200) + 50; // 50 ~ 250
			JLabel label = new JLabel(i+"");
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setOpaque(true); //label에 배경색이 보이게 함
			label.setBackground(Color.RED);
			c.add(label);
		}

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q09_06();
	}
}