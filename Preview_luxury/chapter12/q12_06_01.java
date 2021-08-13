package chapter12;

import java.awt.*;
import javax.swing.*;

public class q12_06_01 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_06_01() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400,400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			int x = this.getWidth() / 10;
			int y = this.getHeight() / 10;
			for(int i = 0; i < 10; i++) {
				g.drawLine(0, y*i, this.getWidth(), y*i);
			}
			for(int i = 0; i < 10; i++) {
				g.drawLine(x*i, 0, x*i, this.getHeight());
			}
		}
	}
	
	public static void main(String[] args) {
		new q12_06_01();
	}
}