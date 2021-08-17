package chapter13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TimerRunnable1 implements Runnable {
	private JLabel timerLabel; //타이머 값이 출력될 레이블
	
	public TimerRunnable1(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n = 0; 
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

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//타이머 스레드로 사용할 Runnable 객체 생성
		TimerRunnable1 runnable = new TimerRunnable1(timerLabel);
		th= new Thread(runnable); //스레드 생성
		c.add(timerLabel);
		
		//버튼 생성, Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); //타이머 스레드 강제 종료, 타이머 스레드에게 InterruptedException 예외 발생시킴
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); //버튼 비활성화
			}
		});
		c.add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();		
	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}