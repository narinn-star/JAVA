package chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q14_04 extends JFrame {
	public q14_04() {
		setTitle("���ڰ� �ƴ� Ű�� �ԷµǴ� ��� ���â �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JToolBar tool = new JToolBar();
		JLabel la = new JLabel("�й� : ");
		JTextField tf = new JTextField();
		tool.add(la);
		tool.add(tf);
		c.add(tool, BorderLayout.SOUTH);
		
		tf.addKeyListener(new MyKeyListener());
		
		setSize(400, 300);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			char keyChar = e.getKeyChar();
	
			if(! Character.isDigit(keyChar)) {
				JOptionPane.showMessageDialog(null, keyChar + "�� ���� Ű�� �ƴմϴ�\n���ڸ� �Է��ϼ���.", "���",
						JOptionPane.ERROR_MESSAGE);
				e.consume();
			}
		}
	}
	
	public static void main(String[] args) {
		new q14_04();
	}
}