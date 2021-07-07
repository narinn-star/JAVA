package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel(); //�� ���̺� ����
	
	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, %Ű:�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource(); //���콺 Ŭ��
			
			//la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");
			
			if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.green);
			else if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.yellow);
		}
	}
	public static void main(String[] args) {
		new KeyCodeEx();
	}
}