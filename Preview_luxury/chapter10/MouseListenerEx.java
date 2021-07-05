package chapter10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello"); //"Hello를 출력하기 위한 레이블 
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //컨텐트팬에 이벤트 리스너 달기
		
		c.setLayout(null); //컨텐트팬의 배치관리자 삭제
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250, 250);
		setVisible(true);
	}
	//Mouse리스너 구현
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}