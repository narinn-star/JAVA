package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseWheel_FontSize extends JFrame {
	public MouseWheel_FontSize() {
		super("���콺 ���� ���� ��Ʈ ũ�� �����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation(); //���콺 ���� ���� ���������� �Ʒ��� ���������� �� �� ����
				//n�� ����̸� �Ʒ��� ������ ��, n�� �����̸� ���� ������ ��
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
