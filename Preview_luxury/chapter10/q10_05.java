package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_05 extends JFrame{
	private JLabel la = new JLabel();
	private String text = "Love Java";
	public q10_05() {
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel(text);
		
		KL k = new KL();
		la.addKeyListener(k);
		la.setSize(50, 20);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class KL extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = la.getFont();
			int size = f.getSize();
			if(e.getKeyChar() == '+') {
				la.setFont(new Font("Areal", Font.PLAIN, size + 5));
			}
			else if(e.getKeyChar() == '-' && size > 5) {
				la.setFont(new Font("Areal", Font.PLAIN, size - 5));
			}
		}
	}
	
	public static void main(String[] args) {
		new q10_05();
	}
}