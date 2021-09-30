package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		super("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton action = new JButton("Action");
		action.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action"))
					btn.setText("�׼�");
				else
					btn.setText("Action");
				
				setTitle(btn.getText()); //AnonymousClassListener.this.setTitle(b.getText());
			}
		});
		c.add(action);
		
		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}