package chapter14;

import javax.swing.*;

public class q14_01 extends JFrame {
	public q14_01() {
		super("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu editMenu = new JMenu("편집");
		JMenu showMenu = new JMenu("보기");
		JMenu inputMenu = new JMenu("입력");
		
		showMenu.add(new JMenuItem("화면확대"));
		showMenu.add(new JMenuItem("쪽윤곽"));
		
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