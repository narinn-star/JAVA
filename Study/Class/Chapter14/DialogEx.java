package Chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogEx extends JFrame {
	private MyDialog dialog;
	
	public DialogEx() {
		super("dialogEx 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		
		dialog = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx();
	}
}

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("Ok");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
			}
		});
	}
}
