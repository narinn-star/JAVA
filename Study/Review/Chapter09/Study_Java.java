package Chapter09;

import javax.swing.*;

public class Study_Java extends JFrame {
	public Study_Java() {
		super("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Study_Java();
	}
}