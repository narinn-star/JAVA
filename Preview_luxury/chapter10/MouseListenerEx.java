package chapter10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello"); //"Hello�� ����ϱ� ���� ���̺� 
	
	public MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //����Ʈ�ҿ� �̺�Ʈ ������ �ޱ�
		
		c.setLayout(null); //����Ʈ���� ��ġ������ ����
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	//Mouse������ ����
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}