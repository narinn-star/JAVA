package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q12_05 extends JFrame {
	private MyPanel panel = new MyPanel();

	public q12_05() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/apple.jpg");
		Image img = icon.getImage();
		int width, height;
		
		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);

			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						width *= 1.1;
						height *= 1.1;
					}
					else if(e.getKeyChar() == '-') {
						width *= 0.9;
						height *= 0.9;
					}
					repaint();
				}
			});			
			setFocusable(true);
			requestFocus();
		}
		
			
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}

	public static void main(String[] args) {
		new q12_05();
	}
}