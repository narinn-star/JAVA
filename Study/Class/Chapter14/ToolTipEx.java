package Chapter14;

import java.awt.*;
import javax.swing.*;

public class ToolTipEx extends JFrame {
	public ToolTipEx() {
		super("툴팁 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTool();
		
		setSize(400, 250);
		setVisible(true);
	}
	
	private void createTool() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		bar.add(saveBtn);
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요.");
		bar.add(tf);
		add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}
}