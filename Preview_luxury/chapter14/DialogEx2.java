package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame, title, true); //true = 모달 타입
		setLayout(new FlowLayout());
		add(tf);
		add(okBtn);
		setSize(200, 100);
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //다이얼로그 닫기
			}
		});
	}
	//텍스트필드 창에 사용자가 입력한 문자열 리턴
	//입력된 내용이 없으면 null 리턴
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
		super("DialogEx2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		
		dialog = new MyModalDialog(this, "Test Modal Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); //모달 다이얼로그는 setVisible 내에서 다이얼로그가 닫힐 때까지 리턴X
				
				String text = dialog.getInput(); //모달 다이얼로그가 닫히면 실행
				
				if(text == null)
					return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text); //입력한 문자열로 버튼의 문자열 변경
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