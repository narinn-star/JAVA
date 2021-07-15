package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_07 extends JFrame{
	private JLabel la = new JLabel();
	private String st = "Love Java";
	public q10_07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la = new JLabel(st);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		ML m = new ML();
		la.addMouseWheelListener(m);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class ML implements MouseWheelListener{
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			Font f = la.getFont();
			int size = f.getSize();
			
			if (n < 0 && size > 5) {
				la.setFont(new Font("Areal", Font.PLAIN, size - 5));
			}
			else {
				la.setFont(new Font("Areal", Font.PLAIN, size + 5));
			}
		}
	}

	public static void main(String[] args) {
		new q10_07();
	}
}