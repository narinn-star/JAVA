package chapter12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

class Circle {
	int x, y, w, h;
	public Circle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}

public class q12_08 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_08() {
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(800, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Vector<Circle> v = new Vector<>();
		int startX, startY, destX, destY;
		
		public MyPanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					startX = e.getX();
					startY = e.getY();
				}
				
				public void mouseReleased(MouseEvent e) {
					destX = e.getX();
					destY = e.getY();
					v.add(new Circle(startX, startY, destX, destY));
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i = 0; i < v.size(); i++) {
				Circle c = v.get(i);
				setForeground(Color.magenta);
				g.drawOval(c.x, c.y, c.w, c.h);
			}
		}
	}
	
	public static void main(String[] args) {
		new q12_08();
	}
}
