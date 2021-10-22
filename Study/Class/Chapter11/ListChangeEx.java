package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ListChangeEx extends JFrame {
	public ListChangeEx() {
		super("리스트 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("이름 입력 후 <Enter> 키");
		Vector<String> v = new Vector<String>();
		JList<String> nameList = new JList<>(v);
		JTextField tf = new JTextField(10);
		
		c.add(label);
		c.add(tf);
		
		v.add("황기태");
		v.add("이재문");
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