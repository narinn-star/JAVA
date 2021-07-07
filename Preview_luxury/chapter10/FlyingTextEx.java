package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10; // 레이블이 한 번 움직이는 단위는 10픽셀
	private JLabel la = new JLabel("HELLO"); // 키 입력에 따라 움직일 레이블 컴포넌트

	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);

		setSize(300, 300);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();

		// 컨텐트팬에 포커스를 잃은 경우 마우스를 클릭하면 다시 포커스를 얻게 함
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component) e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}

	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			// 키; 코드 값에 따라 상,하,좌,우 키를 판별하고 la의 위치를 이동
			switch (keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}
}