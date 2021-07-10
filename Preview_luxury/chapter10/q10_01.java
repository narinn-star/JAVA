package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_01 extends JFrame{
	private JLabel la = new JLabel("�����");
	
	public q10_01() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ML listener = new ML();
		la.addMouseListener(listener); //��� �̺�Ʈ �߻��ϴ��� Ȯ���ϱ� (c �ƴϰ� la!!)
		
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
			
			la.setText("�����");
		}
	}
	
	public static void main(String[] args) {
		new q10_01();
	}
}