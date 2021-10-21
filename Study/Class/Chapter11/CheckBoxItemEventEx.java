package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] name = { "���", "��", "ü��" };
	JLabel sumLabel = new JLabel("���� 0 �� �Դϴ�.");

	public CheckBoxItemEventEx() {
		super("üũ�ڽ��� ItemEventEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("��� 100��, �� 500��, ü�� 20000��");
		c.add(label);

		itemListener listener = new itemListener();
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(name[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		c.add(sumLabel);

		setSize(250, 300);
		setVisible(true);
	}

	public class itemListener implements ItemListener {
		int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == fruits[0]) {
					sum += 100;
				} else if (e.getItem() == fruits[1]) {
					sum += 500;
				} else {
					sum += 20000;
				}
			} else {
				if (e.getItem() == fruits[0]) {
					sum -= 100;
				} else if (e.getItem() == fruits[1]) {
					sum -= 500;
				} else {
					sum -= 20000;
				}
			}
			sumLabel.setText("���� " + sum + " �� �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
