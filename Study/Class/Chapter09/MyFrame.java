package Chapter09;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}