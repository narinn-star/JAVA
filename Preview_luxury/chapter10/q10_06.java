package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_06 extends JFrame {
	private JLabel la = new JLabel();
	private String text = "C";
	public q10_06() {
		setTitle("클릭 연습용 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		la = new JLabel(text);
		
		ML m = new ML();
		la.addMouseListener(m);
		la.setLocation(100,100);
		la.setSize(20, 20);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class ML extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel La = (JLabel)e.getSource();
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*300);
			La.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new q10_06();
	}
}