package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q11_01 extends JFrame {
	private JCheckBox [] box = new JCheckBox [2];
	private JButton btn;
	
	public q11_01() {
		setTitle("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		box[0] = new JCheckBox("��ư ��Ȱ��ȭ");
		box[1] = new JCheckBox("��ư ���߱�");
		
		c.add(box[0]);
		c.add(box[1]);
		
		btn = new JButton("test Button");
		c.add(btn);
		
		MyItemListener listener = new MyItemListener();
		
		box[0].addItemListener(listener);
		box[1].addItemListener(listener);
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED	) {
				if(e.getItem() == box[0])
					btn.setEnabled(false); //��ư ��Ȱ��ȭ
				else
					btn.setVisible(false);
			}
			else { //üũ ���� ���
				if(e.getItem() == box[0])
					btn.setEnabled(true);
				else
					btn.setVisible(true);
			}
		}
		
	}

	public static void main(String[] args) {
		new q11_01();
	}
}