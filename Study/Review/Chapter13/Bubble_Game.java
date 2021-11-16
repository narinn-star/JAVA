package Chapter13;

import java.awt.event.*;
import javax.swing.*;

public class Bubble_Game extends JFrame {
	private myPanel panel = new myPanel();
	public Bubble_Game() {
		super("버블 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class myPanel extends JPanel {
		public myPanel(){
			setLayout(null);
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Bubble th = new Bubble(e.getX(), e.getY());
					th.start();
				}
			});
		}
	}
		
	class Bubble extends Thread {
		JLabel bubble;
		
		public Bubble(int x, int y) {
			ImageIcon icon = new ImageIcon("images/bubble.jpg");
			bubble = new JLabel(icon);
			bubble.setSize(50, 50);
			bubble.setLocation(x, y);
			add(bubble);
			repaint();
		}
		
		public void run() {
			while (true) {
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
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Bubble_Game();
	}
}