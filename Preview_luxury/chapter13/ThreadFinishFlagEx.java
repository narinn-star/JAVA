package chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false; //�������� ���� ����� ǥ���ϴ� �÷���. true : ���� ����
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void finish() { //������ ���� ����� flag�� ǥ��
		flag = true;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint(); //����Ʈ���� �ٽ� �׷� �߰��� ���̺��� ���̰� ��
			try {
				sleep(300); //0.3�� sleep
				if(flag) {
					contentPane.removeAll(); // ����Ʈ�ҿ� �ִ� ��� ���̺� ����
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100,100);
					label.setForeground(Color.red);
					contentPane.add(label);
					contentPane.repaint();
					return; //������ ����
				}
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th; //������ ��ü
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish(); //RandomThread ������ ���� ���
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThread(c); //������ ����, �����忡 ����Ʈ�� ����
		th.start();
	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}