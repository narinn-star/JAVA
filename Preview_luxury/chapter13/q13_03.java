package chapter13;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

public class q13_03 extends JFrame {
	private JLabel la = new JLabel();

	public q13_03() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		la.setFont(new Font("Gothic", Font.ITALIC, 100));
		c.add(la, BorderLayout.CENTER);

		DigitalThread th = new DigitalThread(la);
		th.start();

		setSize(400, 300);
		setVisible(true);
	}

	class DigitalThread extends Thread {
		private JLabel la;

		public DigitalThread(JLabel la) {
			this.la = la;
		}

		public void run() {
			while (true) {
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);

				String clockText = Integer.toString(hour);
				clockText = clockText.concat(":");
				clockText = clockText.concat(Integer.toString(min));
				clockText = clockText.concat(":");
				clockText = clockText.concat(Integer.toString(second));

				la.setText(clockText);
			}
		}
	}

	public static void main(String[] args) {
		new q13_03();
	}
}