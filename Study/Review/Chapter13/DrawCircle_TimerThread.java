package Chapter13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DrawCircle extends Thread {
	private MyPanel panel;

	public DrawCircle(MyPanel panel) {
		this.panel = panel;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(400);
				panel.repaint();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = (int) (Math.random() * 250);
		int y = (int) (Math.random() * 250);
		g.setColor(Color.magenta);
		g.drawOval(x, y, 50, 50);
	}
}

public class DrawCircle_TimerThread extends JFrame {
	private MyPanel panel = new MyPanel();
	DrawCircle_TimerThread() {
		super("원을 0.5초 간격으로 랜덤 위치에 이동하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		DrawCircle th = new DrawCircle(panel);

		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				th.start();
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DrawCircle_TimerThread();
	}
}