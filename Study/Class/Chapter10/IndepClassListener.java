package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		super("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton action = new JButton("Action");
		c.add(action);
		action.addActionListener(new MyActionListener());
		
		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action"))
				btn.setText("액션");
			else
				btn.setText("Action");
	}
}