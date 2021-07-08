package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");

	public MouseListenerAllEx() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener(); // ������ ��ü ����
		c.addMouseListener(listener); // MouseListener ������ ���
		c.addMouseMotionListener(listener); // MouseMotionListener ������ ���

		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}

	// Mouse �����ʿ� MouseMotion �����ʸ� ��� ���� ������ �ۼ�
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseMotionListener�� 2�� �޼ҵ� ����
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + "," + e.getY() + ")");
		}

		// MouseListener�� 5�� �޼ҵ� ����
		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource(); // ���콺�� �ö� ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource(); // ���콺�� ������ ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.yellow);
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}