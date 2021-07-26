package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q11_02 extends JFrame {
	private JTextField text = new JTextField(10);
	private JComboBox<String> comBox = new JComboBox<>();
	
	public q11_02() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(text);
		c.add(comBox);
		
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				comBox.addItem(t.getText()); //벡터에 v에 입력된 이름 추가
				t.setText("");
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q11_02();
	}
}