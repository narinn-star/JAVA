package Chapter11;

import java.awt.*;
import javax.swing.*;

public class MoneyChanger_Checkbox extends JFrame {
	static String[] money = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" };

	public MoneyChanger_Checkbox() {
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(10, 3, 5, 5);
		c.setLayout(grid);
		c.setBackground(Color.PINK);

		c.add(new JLabel("�ݾ�"));
		c.add(new JTextField(10));
		c.add(new JButton("���"));
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