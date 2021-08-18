package chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false; //스레드의 종료 명령을 표시하는 플래그. true : 종료 지시
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void finish() { //스레드 종료 명령을 flag에 표시
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
			contentPane.repaint(); //컨텐트팬을 다시 그려 추가된 레이블이 보이게 함
			try {
				sleep(300); //0.3초 sleep
				if(flag) {
					contentPane.removeAll(); // 컨텐트팬에 있는 모든 레이블 제거
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100,100);
					label.setForeground(Color.red);
					contentPane.add(label);
					contentPane.repaint();
					return; //스레드 종료
				}
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th; //스레드 객체
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish(); //RandomThread 스레드 종료 명령
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThread(c); //스레드 생성, 스레드에 컨텐트팬 전달
		th.start();
	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}