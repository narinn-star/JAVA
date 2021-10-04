package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame {
	JLabel label = new JLabel("HELLO");

	public FlyingTextEx() {
		super("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

				if (keyCode == KeyEvent.VK_UP)
					label.setLocation(label.getX(), label.getY() - 10);
				else if (keyCode == KeyEvent.VK_DOWN)
					label.setLocation(label.getX(), label.getY() + 10);
				else if (keyCode == KeyEvent.VK_RIGHT)
					label.setLocation(label.getX() + 10, label.getY());
				else if (keyCode == KeyEvent.VK_LEFT)
					label.setLocation(label.getX() - 10, label.getY());
			}
		});
		
		//���� �ڵ�� ����Ʈ�ҿ� ��Ŀ���� ���� ���, ���콺�� Ŭ���ϸ� �ٽ� ��Ŀ���� ��� ��.
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource(); //���콺�� Ŭ���� ������Ʈ
				com.setFocusable(true);
				com.requestFocus(); //���콺�� Ŭ���� ������Ʈ���� ��Ŀ�� ����
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();

		label.setLocation(50, 50);
		label.setSize(50, 10);
		c.add(label);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}
}