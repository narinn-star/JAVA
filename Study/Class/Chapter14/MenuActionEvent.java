package Chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuActionEvent extends JFrame {
	private JLabel label = new JLabel();
	
	public MenuActionEvent() {
		super("Menu에 Action 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		getContentPane().add(label, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu screen = new JMenu("Screen");
		
		JMenuItem[] items = new JMenuItem[4];
		String[] title = {"Load", "Hide", "ReShow", "Exit"};
		
		MenuActionListener listener = new MenuActionListener();
		for(int i = 0; i < items.length; i++) {
			items[i] = new JMenuItem(title[i]);
			items[i].addActionListener(listener);
			screen.add(items[i]);
		}
		
		bar.add(screen);
		
		setJMenuBar(bar);
		
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();		//사용자가 선택한 메뉴아이템의 문자열 리턴
			switch(cmd) {
			case "Load":
				if(label.getIcon() != null) 
					return;
				label.setIcon(new ImageIcon("images/img.jpg"));
				break;
			case "Hide":
				label.setVisible(false);
				break;
			case "ReShow":
				label.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MenuActionEvent();
	}

}
