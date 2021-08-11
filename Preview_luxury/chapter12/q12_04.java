package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q12_04 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/apple.jpg");
	private Image img = icon.getImage();

	public q12_04() {
		setTitle("이미지 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Point p = new Point(0, 0);
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, p.x, p.y, img.getWidth(this), img.getHeight(this), this);
			
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					p.x = e.getX();
					p.y = e.getY();
					repaint();
				}
			});
		}
	}

	public static void main(String[] args) {
		new q12_04();
	}
}