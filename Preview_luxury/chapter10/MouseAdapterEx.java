package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame{
	private JLabel la = new JLabel("Hello");
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null); //컨텐트팬의 배치관리자 삭제
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	//MouseAdapter를 상속받아 리스너 구현
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}