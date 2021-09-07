package chapter13;

import java.awt.event.*;
import javax.swing.*;

public class q13_06 extends JFrame {
	private MyPanel panel = new MyPanel();
	public q13_06() {
		setTitle("버블 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			setLayout(null);
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					BubbleThread th = new BubbleThread(e.getX(), e.getY());
					th.start();
				}
			});
		}
	}
	
	class BubbleThread extends Thread {
		JLabel bubble;
		public BubbleThread(int x, int y) {
			ImageIcon icon = new ImageIcon("images/bubble.jpg");
			bubble = new JLabel(icon);
			bubble.setSize(50, 50);
			bubble.setLocation(x, y);
			add(bubble);
			repaint();
		}
		
		public void run() {
			while(true) {
				int x = bubble.getX();
				int y = bubble.getY() - 5;
				
				if(y < 0) {
					remove(bubble);
					repaint();
					return;
				}
				bubble.setLocation(x, y);
				repaint();
				
				try {
					sleep(200);
				}
				catch(InterruptedException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new q13_06();
	}
}