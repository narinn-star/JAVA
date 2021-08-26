package chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("���� ���� �ð� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//ü�� �̹���
		JLabel cherry = new JLabel(new ImageIcon("images/cherry.jpg"));
		cherry.setToolTipText("ü�� �̹��� ���");
		
		//��� �̹���
		JLabel apple = new JLabel(new ImageIcon("images/apple.jpg"));
		apple.setToolTipText("��� �̹��� ���");
		
		c.add(cherry);
		c.add(apple);
		
		//ToolTipManager ��ü ���
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0); //�ʱ� ���� ��� ���� �ð� 0��
		m.setDismissDelay(10000); //���� ���� �ð� 10��
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}