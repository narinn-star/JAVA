package chapter13;

import javax.swing.*;
import java.awt.*;

public class q13_04_02 extends JFrame {
	private JLabel label = new JLabel("진동 레이블");
	
	public q13_04_02() {
		setTitle("진동하는 레이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setFont(new Font("Gothic", Font.PLAIN, 30));
		label.setSize(200, 40);
		c.add(label);
		
		LabelThread th = new LabelThread(label);
		th.start();
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class LabelThread extends Thread {
		private JLabel label;
		int x = 100;
		
		public LabelThread(JLabel label) {
			this.label = label;
		}
		
		public void run() {
			while(true) {
				if(x == 100)
					x += 10;
				else
					x -= 10;
				label.setLocation(x, x);
			}
		}
	}

	public static void main(String[] args) {
		new q13_04_02();
	}

}
