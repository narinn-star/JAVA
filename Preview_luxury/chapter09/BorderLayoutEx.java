package chapter09;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//컨텐트팬에 BorderLayout 배치관리자 설정
		c.setLayout(new BorderLayout(30, 20)); //hGap = 30, vGap = 20;
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}