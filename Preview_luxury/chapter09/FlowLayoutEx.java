package chapter09;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//컨텐트팬에 FlowLayout 배치관리자 설정
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // FlowLayout.LEFT로 설정, hGap = 30, vGap = 40
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}