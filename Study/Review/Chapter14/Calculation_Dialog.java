package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculation_Dialog extends JFrame {
	private	JLabel label = new JLabel("계산 결과 출력");
	
	public Calculation_Dialog() {
		super("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton cal = new JButton("calculate");
		label.setBackground(Color.green);
		label.setOpaque(true);
		
		Dialog dialog = new Dialog(this);
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		c.add(cal);
		c.add(label);
		
		setSize(300,250);
		setVisible(true);
	}
	
	class Dialog extends JDialog {
		private JLabel la = new JLabel("두 수를 더합니다.");
		private JTextField a = new JTextField(12);
		private JTextField b = new JTextField(12);
		private JButton btn = new JButton("Add");
		
		public Dialog(JFrame frame) {
			super(frame, "Calculation Dialog", true);
			setLayout(new FlowLayout());
			add(la);
			add(a);
			add(b);
			add(btn);
			
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int res = Integer.parseInt(a.getText()) + Integer.parseInt(b.getText());
					label.setText(Integer.toString(res));
				}
			});
			
			setSize(200, 200);
		}
	}

	
	public static void main(String[] args) {
		new Calculation_Dialog();
	}
}