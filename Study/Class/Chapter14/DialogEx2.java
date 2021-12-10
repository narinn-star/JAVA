package Chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DialogEx2 extends JFrame {
private MyModalDialog dialog;
	
	public DialogEx2() {
		super("dialogEx2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		
		dialog = new MyModalDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String text = dialog.getInput();
				if(text == null)return;
				
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DialogEx2();
	}
}

class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("Ok");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame, title, true);
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
	
	String getInput() {
		if(tf.getText().length() == 0)
			return null;
		else return tf.getText();
	}
}
