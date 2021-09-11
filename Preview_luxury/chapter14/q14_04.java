package chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q14_04 extends JFrame {
	public q14_04() {
		setTitle("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JToolBar tool = new JToolBar();
		JLabel la = new JLabel("학번 : ");
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
				JOptionPane.showMessageDialog(null, keyChar + "는 숫자 키가 아닙니다\n숫자를 입력하세요.", "경고",
						JOptionPane.ERROR_MESSAGE);
				e.consume();
			}
		}
	}
	
	public static void main(String[] args) {
		new q14_04();
	}
}