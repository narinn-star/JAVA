package chapter12;

import javax.swing.*;
import java.awt.*;

public class q12_09 extends JFrame {
	public q12_09() {
		setTitle("Blue Label ¸¸µé±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		BlueLabel hello = new BlueLabel("hello");
		hello.setBackground(Color.RED);
		hello.setForeground(Color.YELLOW);	
		hello.setOpaque(true);
		
		c.add(hello);
		
		BlueLabel big_hello = new BlueLabel("Big Hello");
		big_hello.setBackground(Color.RED);
		big_hello.setForeground(Color.MAGENTA);
		big_hello.setFont(new Font("Arial", Font.ITALIC, 50));
		big_hello.setOpaque(true);
		
		c.add(big_hello);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	class BlueLabel extends JLabel {
		public BlueLabel(String s) {
			super(s);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args) {
		new q12_09();
	}
}