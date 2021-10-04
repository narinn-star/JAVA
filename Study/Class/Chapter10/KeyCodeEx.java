package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame {
	JLabel label = new JLabel("F1 �Ǵ� %Ű�� �����ּ���");
	public KeyCodeEx() {
		super("Key Code ���� : F1Ű:�ʷϻ�, %Ű:�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(label);
		c.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				Container c = (Container)e.getSource();
				
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				if(keyChar == '%')
					c.setBackground(Color.YELLOW);
				else if(keyCode == KeyEvent.VK_F1)
					c.setBackground(Color.green);
				label.setText(KeyEvent.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
