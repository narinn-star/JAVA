package chapter13;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; //타이머 값이 출력된 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; //초 카운트를 출력할 레이블
	}
	
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n = 0; //타이머 카운트 값
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
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		//타이머 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel); //스레드 코드로 작동할 run()이 구현된 Runnable 객체 만들기
		Thread th = new Thread(runnable); //스레드 객체 생성
		
		setSize(250, 150);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}