package chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q14_03 extends JFrame {
	public q14_03() {
		setTitle("ToolBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JToolBar toolBar = new JToolBar("Tools");
		JButton exitBtn = new JButton("����");
		
		c.add(toolBar, BorderLayout.NORTH);
		toolBar.add(exitBtn);
		
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "���� �����Ͻðڽ��ϱ�?", "Confirm", 
						JOptionPane.YES_NO_OPTION);
					
				if(res == JOptionPane.YES_OPTION)
					System.exit(0);			
			}
		});
			
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q14_03();
	}
}