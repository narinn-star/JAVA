package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxEx extends JFrame {
	public ComboBoxEx() {
		super("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
		String[] names = { "kitae", "jaemoon", "hyosoo", "namyun" };
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i = 0; i < names.length; i++) {
			nameCombo.addItem(names[i]);
		}
		
		c.add(strCombo);
		c.add(nameCombo);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxEx();
	}
}