package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ListChangeEx extends JFrame {
	public ListChangeEx() {
		super("����Ʈ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("�̸� �Է� �� <Enter> Ű");
		Vector<String> v = new Vector<String>();
		JList<String> nameList = new JList<>(v);
		JTextField tf = new JTextField(10);
		
		c.add(label);
		c.add(tf);
		
		v.add("Ȳ����");
		v.add("���繮");
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText());
				tf.setText("");
				nameList.setListData(v);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}
}