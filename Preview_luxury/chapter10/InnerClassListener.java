package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	//내부 클래스로 Action 리스너 작성
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			//InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText()); //독립클래스에서는 불가능
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
}