package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q11_03 extends JFrame {
	private int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private String[] str = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	private JLabel la = new JLabel();
	private JTextField[] text = new JTextField[str.length];
	private JButton btn = new JButton("계산");
	
	public q11_03() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);
		
		c.add(new JLabel("금액"));
		
		JTextField input = new JTextField(10);
		c.add(input);
		
		btn.setLocation(200, 20);
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				if(s.length() == 0)
					return;
				
				int money = Integer.parseInt(s);
				int res;
				for(int i = 0; i<unit.length; i++) {
					res = money/unit[i];
					text[i].setText(Integer.toString(res));
					if(res>0)
						money = money % unit[i];
				}
			}
		});
				
		for(int i = 0; i < str.length; i++) {
			la = new JLabel(str[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50 + (i * 20));
			
			text[i] = new JTextField(15);
			text[i].setHorizontalAlignment(JTextField.CENTER);
			text[i].setSize(50, 20);
			text[i].setLocation(120, 50 + (i * 20));
			
			c.add(la);
			c.add(text[i]);
		}
	
		
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q11_03();
	}
}