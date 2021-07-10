package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_01 extends JFrame{
	private JLabel la = new JLabel("사랑해");
	
	public q10_01() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ML listener = new ML();
		la.addMouseListener(listener); //어디에 이벤트 발생하는지 확인하기 (c 아니고 la!!)
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	class ML implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) { }

		@Override
		public void mousePressed(MouseEvent e) { }

		@Override
		public void mouseReleased(MouseEvent e) { }
		
		@Override
		public void mouseEntered(MouseEvent e) {
			
			la.setText("Love Java");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			la.setText("사랑해");
		}
	}
	
	public static void main(String[] args) {
		new q10_01();
	}
}