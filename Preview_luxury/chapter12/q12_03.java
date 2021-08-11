package chapter12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q12_03 extends JFrame {
	private JLabel la = new JLabel();	
	private ImageIcon icon = new ImageIcon("images/apple.jpg");
	
	public q12_03() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setLocation(e.getX(), e.getY());
			}
		});
		
		la.setIcon(icon);
		la.setSize(icon.getIconWidth(), icon.getIconHeight());
		c.add(la);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q12_03();
	}
}