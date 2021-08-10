package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q12_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	private ImageIcon icon = new ImageIcon("images/back.jpg");
	private Image img = icon.getImage();
	
	public q12_02() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private Point p = new Point(0, 0);
		
		public MyPanel() {
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					super.mouseDragged(e);
					p = e.getPoint();
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(img, 0, 0, this);		
			g.setColor(Color.green);		
			g.fillOval((int)p.getX(), (int)p.getY(), 20, 20);
		}
		
		
	}
	public static void main(String[] args) {
		new q12_02();
	}
}