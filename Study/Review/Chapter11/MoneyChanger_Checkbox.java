package Chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoneyChanger_Checkbox extends JFrame {
	static String[] money = { "금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	static int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
	static JTextField[] text = new JTextField[9];
	static JCheckBox[] check = new JCheckBox[7];

	public MoneyChanger_Checkbox() {
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel(money[0]);
		la.setSize(40, 20);
		la.setLocation(60, 30);
		c.add(la);

		text[0] = new JTextField(20);
		text[0].setSize(130, 20);
		text[0].setLocation(120, 30);
		c.add(text[0]);

		JButton btn = new JButton("계산");
		btn.setSize(90, 20);
		btn.setLocation(270, 30);
		btn.addActionListener(new MyActionListener());
		c.add(btn);

		for (int i = 1; i < 9; i++) {
			la = new JLabel(money[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(70, 50 + (i * 20));
			c.add(la);

			text[i] = new JTextField(30);
			text[i].setHorizontalAlignment(JTextField.CENTER);
			text[i].setSize(100, 20);
			text[i].setLocation(140, 50 + (i * 20));
			c.add(text[i]);

			if (i < 8) {
				check[i - 1] = new JCheckBox();
				check[i - 1].setBackground(Color.PINK);
				check[i - 1].setSize(20, 20);
				check[i - 1].setLocation(265, 50 + (i * 20));
				c.add(check[i - 1]);
			}
		}

		c.setBackground(Color.PINK);
		setSize(400, 350);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String input = text[0].getText();

			if (input.length() == 0) // 입력 금액이 0일 때 함수 종료
				return;

			int money = Integer.parseInt(input);
			int res;

			for (int i = 0; i < 8; i++) {
				if (i == 7) { // 1원만 사용할 때
					res = money / unit[i];
					text[i + 1].setText(Integer.toString(res));
					break;
				}

				if (check[i].isSelected() == false) { // 체크박스 false인 경우 0으로 초기화
					text[i + 1].setText("0");
					continue;
				}

				res = money / unit[i];
				text[i + 1].setText(Integer.toString(res));

				if (res > 0) // 바꾸어야 할 돈이 남았을 때
					money = money % unit[i];
			}
		}
	}

	public static void main(String[] args) {
		new MoneyChanger_Checkbox();
	}
}