package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlyingTextEx extends JFrame {
	JLabel label = new JLabel("HELLO");

	public FlyingTextEx() {
		super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
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
		
		//다음 코드는 컨텐트팬에 포커스를 잃은 경우, 마우스를 클릭하면 다시 포커스를 얻게 함.
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource(); //마우스가 클릭된 컴포넌트
				com.setFocusable(true);
				com.requestFocus(); //마우스가 클릭된 컴포넌트에게 포커스 설정
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