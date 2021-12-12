package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		super("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new MyPanel(), BorderLayout.NORTH);
		
		setSize(500, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private JButton inputBtn = new JButton("Input Name");
		private JButton confirmBtn = new JButton("Confirm");
		private JButton msgBtn = new JButton("Message");
		private JTextField field = new JTextField(10);
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(field);
			
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input = JOptionPane.showInputDialog("이름을 입력하세요");
					if(input != null)
						field.setText(input);
				}
			});
			
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int res = JOptionPane.showConfirmDialog(null, "계속할 것입니까?","Confirm", JOptionPane.YES_NO_OPTION);
					
					if(res == JOptionPane.CLOSED_OPTION)
						field.setText("Just Closed without Selection");
					else if(res == JOptionPane.YES_OPTION)
						field.setText("YES");
					else
						field.setText("NO");						
				}
			});
			
			msgBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}

	public static void main(String[] args) {
		new OptionPaneEx();
	}
}