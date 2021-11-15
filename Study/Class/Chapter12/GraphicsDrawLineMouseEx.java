package Chapter12;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	public GraphicsDrawLineMouseEx() {
		super("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<>();
		private Vector<Point> vEnd = new Vector<>();
		
		public void paintComponent(Graphics g) {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
			
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}