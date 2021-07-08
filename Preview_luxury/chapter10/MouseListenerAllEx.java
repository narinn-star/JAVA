package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");

	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener(); // 리스너 객체 생성
		c.addMouseListener(listener); // MouseListener 리스너 등록
		c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록

		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}

	// Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 작성
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseMotionListener의 2개 메소드 구현
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + "," + e.getY() + ")");
		}

		// MouseListener의 5개 메소드 구현
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
			Component c = (Component) e.getSource(); // 마우스가 올라간 컴포넌트를 알아낸다.
			c.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource(); // 마우스가 내려간 컴포넌트를 알아낸다.
			c.setBackground(Color.yellow);
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}