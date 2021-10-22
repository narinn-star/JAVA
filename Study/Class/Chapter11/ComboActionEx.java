package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame {
	public ComboActionEx() {
		super("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		String[] fruits = { "apple", "banana", "kiwi", "mango" };
		ImageIcon[] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"),
				new ImageIcon("images/kiwi.jpg"), new ImageIcon("images/mango.jpg") };
		JLabel label = new JLabel(images[0]);
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx = strCombo.getSelectedIndex();
				label.setIcon(images[idx]);
			}
		});
		
		c.add(strCombo);
		c.add(label);

		setSize(400, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}