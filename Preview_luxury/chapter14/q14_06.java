package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q14_06 extends JFrame {
	private JLabel result = new JLabel("계산 결과 출력");
	private JTextField a = new JTextField(12);
	private JTextField b = new JTextField(12);
	
	public q14_06() {
		setTitle("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton cal = new JButton("calculate");
		c.add(cal);
		result.setBackground(Color.green);
		c.add(result);
		result.setOpaque(true);
		
		calDialog d = new calDialog(this, "Calculation Dialog");

		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class calDialog extends JDialog {	
		JButton add = new JButton("ADD");
		
		public calDialog(JFrame frame, String title) {
			super(frame, title, true);
			setLayout(new FlowLayout());
			
			JLabel la = new JLabel("두 수를 더합니다.");
			add(la);
			add(a);
			add(b);
			add(add);
			
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int res = Integer.parseInt(a.getText()) + Integer.parseInt(b.getText());
					result.setText(Integer.toString(res));
				}
			});		
			
			setSize(200, 200);
		}
	}
	
	public static void main(String[] args) {
		new q14_06();
	}
}