package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickAndDoubleClickEx extends JFrame{
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		setSize(300, 200);
		setVisible(true);
	}
	
	//MouseAdapter를 상속받아 Mouse리스너 구현
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				// [0, 255] 사이의 랜덤한 r,g,b 정수 값 얻기
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}
	}
	
	public static void main(String[] args) {
		new ClickAndDoubleClickEx();
	}
}