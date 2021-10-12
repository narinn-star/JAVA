package Chapter11;

import java.awt.*;
import javax.swing.*;

public class MoneyChanger_Checkbox extends JFrame {
	static String[] money = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };

	public MoneyChanger_Checkbox() {
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(10, 3, 5, 5);
		c.setLayout(grid);
		c.setBackground(Color.PINK);

		c.add(new JLabel("금액"));
		c.add(new JTextField(10));
		c.add(new JButton("계산"));
		for(int i = 0; i < 8; i++) {
			c.add(new JLabel(money[i]));
			c.add(new JTextField(7));
			c.add(new JCheckBox()).setBackground(Color.PINK);;
		}

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MoneyChanger_Checkbox();
	}
}