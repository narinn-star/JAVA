package chapter14;

import javax.swing.*;

public class q14_01 extends JFrame {
	public q14_01() {
		super("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		JMenu editMenu = new JMenu("����");
		JMenu showMenu = new JMenu("����");
		JMenu inputMenu = new JMenu("�Է�");
		
		showMenu.add(new JMenuItem("ȭ��Ȯ��"));
		showMenu.add(new JMenuItem("������"));
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(showMenu);
		mb.add(inputMenu);
		
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new q14_01();
	}
}