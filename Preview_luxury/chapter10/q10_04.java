package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_04 extends JFrame{
	private JLabel la = new JLabel();
	private String text = "Love Java";
	public q10_04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel(text);
		
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
				String s = text.substring(1) + text.substring(0,1);
				la.setText(s);
				text = s;
			}
		}
	}

	public static void main(String[] args) {
		new q10_04();
	}
}