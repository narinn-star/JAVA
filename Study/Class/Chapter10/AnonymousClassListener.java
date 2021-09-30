package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		super("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton action = new JButton("Action");
		action.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action"))
					btn.setText("액션");
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