package chapter13;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; //�� ī��Ʈ�� ����� ���̺�
	}
	
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		//Ÿ�̸� ������� ����� Runnable ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerRunnable runnable = new TimerRunnable(timerLabel); //������ �ڵ�� �۵��� run()�� ������ Runnable ��ü �����
		Thread th = new Thread(runnable); //������ ��ü ����
		
		setSize(250, 150);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}