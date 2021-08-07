package chapter12;

import java.awt.*;
import javax.swing.*;

public class paintComponentEx extends JFrame {
	public paintComponentEx() {
		setTitle("새로운 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		c.add(b);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyButton extends JButton {
		public MyButton(String s) {
			super(s); //JButton의 생성자 호출
		}
		
		public void paintComponent(Graphics g) { //새로운 버튼 그리기
			super.paintComponent(g); //JButton에게 기본 버튼 모양을 그리도록 한다.
			//JButton의 기본 모양 위에 추가적으로 빨간색으로 버튼 크기만한 타원 그리기
			g.setColor(Color.red);
			g.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
		}
	}
	
	public static void main(String[] args) {
		new paintComponentEx();
	}
}