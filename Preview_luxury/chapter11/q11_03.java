package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q11_03 extends JFrame {
	private int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	private JLabel la = new JLabel();
	private JTextField[] text = new JTextField[str.length];
	private JButton btn = new JButton("계산");
	
	public q11_03() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);
		
		la= new JLabel(str[0]);
		la.setSize(40, 20);
		la.setLocation(30, 20);
		c.add(la);
		
		text[0] = new JTextField(30);
		text[0].setSize(50, 20);
		text[0].setLocation(90, 20);
		c.add(text[0]);
		
		btn.setLocation(200, 20);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = text[0].getText();
				if(s.length() == 0)
					return;
				
				int money = Integer.parseInt(s);
				int res;
				for(int i = 0; i<unit.length; i++) {
					res = money/unit[i];
					text[i + 1].setText(Integer.toString(res));
					if(res>0)
						money = money % unit[i];
				}
			}
		});
		c.add(btn);
		
		for(int i = 1; i < str.length; i++) {
			la = new JLabel(str[i]);
			la.setHorizontalAlignment(JLabel.LEFT);
			la.setSize(40, 20);
			la.setLocation(50, 50 + (i * 20));
			
			text[i] = new JTextField(30);
			text[i].setHorizontalAlignment(JTextField.RIGHT);
			text[i].setSize(50, 20);
			text[i].setLocation(120, 50 + (i * 20));
			
			c.add(la);
			c.add(text[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q11_03();
	}
}