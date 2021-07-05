package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); //�ٿ�ĳ����, �̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); //Action �̺�Ʈ ������ �ޱ�
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
