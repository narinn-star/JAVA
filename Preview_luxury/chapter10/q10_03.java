package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_03 extends JFrame{
	private JLabel la = new JLabel();
	private StringBuffer sb = new StringBuffer("Love Java");
	public q10_03() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel("Love Java");
		
		KL k = new KL();
		la.addKeyListener(k);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
		
	}
	
	class KL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				sb.reverse();
				la.setText(sb.toString());
			}
		}

	}
	public static void main(String[] args) {
		new q10_03();
	}
}