package chapter13;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() { //run()�� ������ �ڵ�μ� start() �޼ҵ尡 ȣ��� �� �����尡 ������ �����ϴ� �޼ҵ�
		int n = 0; //Ÿ�̸� ī��Ʈ ��
		while(true) { //���� ����
			timerLabel.setText(Integer.toString(n)); //���̺��� ī��Ʈ �� ���
			n++; //ī��Ʈ ����
			try {
				sleep(1000); //1�� ���� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); //���̺��� ����Ʈ�ҿ� ����
		
		//Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel); //������ ��ü �����
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); //Ÿ�̸� �������� ������ �����ϰ� �Ѵ�. -> TimerThread�� run() �޼ҵ尡 ������ �����Ѵ�.
	}
	
	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}