package chapter13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q13_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q13_02() {
		setTitle("원을 0.5초 간격으로 이동시키기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		TimerThread th = new TimerThread(panel);
		
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				th.start();
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.magenta);
			int x = (int)(Math.random() * 250);
			int y = (int)(Math.random() * 250);
			g.drawOval(x, y, 50, 50);
		}
	}
	
	class TimerThread extends Thread {
		private MyPanel panel;
		
		public TimerThread(MyPanel panel) {
			this.panel = panel;
		}
		
		public void run() {
			while(true) {
				try {
					sleep(400);
					panel.repaint();
				}
				catch(InterruptedException e){
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new q13_02();
	}
}