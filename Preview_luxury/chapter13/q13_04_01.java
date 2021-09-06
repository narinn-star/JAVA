package chapter13;

import javax.swing.*;

public class q13_04_01 extends JFrame {
	public q13_04_01() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FrameThread th = new FrameThread(this);
		th.start();
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class FrameThread extends Thread {
		private JFrame frame;
		int x = 400;
		
		public FrameThread(JFrame frame) {
			this.frame = frame;
		}
		
		public void run() {
			while(true) {
				if(x == 400)
					x += 10;
				else
					x-= 10;
				frame.setLocation(x, x);
			}
		}
	}

	public static void main(String[] args) {
		new q13_04_01();
	}
}