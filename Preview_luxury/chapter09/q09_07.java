package chapter09;

import javax.swing.*;
import java.awt.*;

public class q09_07 extends JFrame{
	q09_07(){
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel pn = new JPanel();
		JPanel ps = new JPanel();
		JPanel pc = new JPanel();
		
		pn.setBackground(Color.LIGHT_GRAY);
		pc.setLayout(new GridLayout(4, 4));
		ps.setBackground(Color.YELLOW);
		
		c.add(pc);
		c.add(pn, BorderLayout.NORTH);
		c.add(ps, BorderLayout.SOUTH);
		
		JLabel l1 = new JLabel("수식입력");
		JTextField tf1 = new JTextField(20);
		pn.add(l1);
		pn.add(tf1);
		
		JLabel l2 = new JLabel("계산 결과");
		JTextField tf2 = new JTextField(20);
		ps.add(l2);
		ps.add(tf2);
		
		for(int i = 0; i<16; i++) {
			JButton button = new JButton();
			String[] str = {"CE", "계산", "+", "-", "x", "/"};
			pc.setSize(10,30);
			pc.add(button);
			if(i<10) {
				button.setText(i+"");
			}else {
				button.setText(str[i-10]);
			}
			if(i>11) {
				button.setBackground(Color.CYAN);
				button.setOpaque(true);
			}
		}
		
		setSize(350, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new q09_07();
	}
}