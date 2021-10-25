package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoneyChanger extends JFrame {
	static String[] str = { "금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	static int[] money = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

	public MoneyChanger() {
		super("MoneyChanger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel[] la = new JLabel[str.length];
		la[0] = new JLabel(str[0]);
		la[0].setSize(80, 20);
		la[0].setLocation(70, 20);
		c.add(la[0]);

		JTextField[] tf = new JTextField[str.length];
		tf[0] = new JTextField(20);
		tf[0].setSize(110, 20);
		tf[0].setLocation(130, 20);
		c.add(tf[0]);

		JButton btn = new JButton("계산");
		btn.setSize(70, 20);
		btn.setLocation(250, 20);
		c.add(btn);

		for (int i = 1; i < la.length; i++) {
			la[i] = new JLabel(str[i], SwingConstants.RIGHT);
			la[i].setSize(40, 20);
			la[i].setLocation(90, 30 + (i * 20));
			c.add(la[i]);

			tf[i] = new JTextField(20);
			tf[i].setSize(80, 20);
			tf[i].setHorizontalAlignment(JTextField.CENTER);
			tf[i].setLocation(145, 30 + (i * 20));
			c.add(tf[i]);
		}

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = Integer.parseInt(tf[0].getText());
				
				for(int i = 0; i < money.length; i++) {
					int res = total / money[i];
					tf[i + 1].setText(Integer.toString(res));
					total = total % money[i];
				}
			}
		});
		c.setBackground(Color.pink);

		setSize(350, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MoneyChanger();
	}
}