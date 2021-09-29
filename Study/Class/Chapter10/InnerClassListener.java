package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton action = new JButton("Action");
		action.addActionListener(new MyActionListener());
		c.add(action);
		
		setSize(400, 150);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action"))
				btn.setText("�׼�");
			else
				btn.setText("Action");
			
			InnerClassListener.this.setTitle(btn.getText());
		}	
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}