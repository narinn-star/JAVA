package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JComboBox_JTextField extends JFrame {
	public JComboBox_JTextField() {
		setTitle("JTextField and JComponenet Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField(10);
		JComboBox<String> box = new JComboBox<String>();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText();
				box.addItem(str);
				tf.setText("");
			}
		});
		
		c.add(tf);
		c.add(box);
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComboBox_JTextField();
	}
}