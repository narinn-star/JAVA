package chapter13;

import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay; //������ �ٲ�� ���� �ð�. �и��� ����
	
	public FlickeringLabel(String text, long delay) { //������
		super(text); //JLabel ������ ȣ��
		this.delay = delay;
		setOpaque(true); //���� ������ �����ϵ��� ����
		
		Thread th = new Thread(this); //Thread()�� �����ڿ� this�� �ѱ�� ���� �� Ŭ������ Runnable�� ��ӹ޾� run()�� ������ ��ü���� ǥ��. 
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0)
				setBackground(Color.yellow);
			else
				setBackground(Color.green);
			if(n == 0)
				n = 1;
			else
				n = 0;
			
			try {
				Thread.sleep(delay); //delay �и��� ���� sleep
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����", 500); //0.5��
		
		//�������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		
		//�����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300); //0.3��
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}