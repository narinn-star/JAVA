package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10); //���̾�α׿� ������ �ؽ�Ʈ�ʵ�
	private JButton okBtn = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okBtn);
		
		setSize(200, 100);
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); // â�ݱ� (���̾�α� ������ �ʰ�)
			}
		});
	}
}

public class DialogEx extends JFrame {
	private MyDialog dialog;
	
	public DialogEx() {
		super("dialogEx ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		
		dialog = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //���̾�α� ��� �� �۵�
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