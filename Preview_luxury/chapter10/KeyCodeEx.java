package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel(); //빈 레이블 생성
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, %키:노란색");
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
			Container contentPane = (Container)e.getSource(); //마우스 클릭
			
			//la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");
			
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