package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseWheel_FontSize extends JFrame {
	public MouseWheel_FontSize() {
		super("마우스 휠을 굴려 폰트 크기 조절하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation(); //마우스 휠이 위로 굴려졌는지 아래로 굴려졌는지 알 수 있음
				//n이 양수이면 아래로 굴려진 것, n이 음수이면 위로 굴려진 것
				int size = label.getFont().getSize();
				if(n < 0 && size > 5) {
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
				else {
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
			}
		});
		
		c.add(label);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseWheel_FontSize();
	}

}
