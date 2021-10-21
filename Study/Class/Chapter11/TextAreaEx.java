package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {
	public TextAreaEx() {
		super("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���");
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7, 20);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		
		c.add(label);
		c.add(tf);
		c.add(ta);
		
		setSize(400, 500);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}