package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); //다운캐스팅, 이벤트 소스 버튼 알아내기
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); //Action 이벤트 리스너 달기
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
