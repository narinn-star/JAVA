package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class q12_07 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_07() {
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Vector<Integer> X = new Vector<>();
		Vector<Integer> Y = new Vector<>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					X.add(e.getX());
					Y.add(e.getY());
					
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			int[] xPoints = new int[X.size()];
			int[] yPoints = new int[Y.size()];
			
			for(int i = 0; i < xPoints.length; i++) {
				xPoints[i] = (int)X.elementAt(i);
				yPoints[i] = (int)Y.elementAt(i);
			}
			
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawPolygon(xPoints, yPoints, xPoints.length);
		}
	}

	public static void main(String[] args) {
		new q12_07();
	}
}