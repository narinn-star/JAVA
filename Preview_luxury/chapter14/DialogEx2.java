package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame, title, true); //true = ��� Ÿ��
		setLayout(new FlowLayout());
		add(tf);
		add(okBtn);
		setSize(200, 100);
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //���̾�α� �ݱ�
			}
		});
	}
	//�ؽ�Ʈ�ʵ� â�� ����ڰ� �Է��� ���ڿ� ����
	//�Էµ� ������ ������ null ����
	public String getInput() {
		if(tf.getText().length() == 0)
			return null;
		else
			return tf.getText();
	}
}

public class DialogEx2 extends JFrame {
	private MyModalDialog dialog;
	
	public DialogEx2() {
		super("DialogEx2 ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		
		dialog = new MyModalDialog(this, "Test Modal Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //��� ���̾�α״� setVisible ������ ���̾�αװ� ���� ������ ����X
				
				String text = dialog.getInput(); //��� ���̾�αװ� ������ ����
				
				if(text == null)
					return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text); //�Է��� ���ڿ��� ��ư�� ���ڿ� ����
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