package Chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel hello = new JLabel("Hello");
	
	public MenuAndColorChooserEx() {
		super("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		hello.setHorizontalAlignment(SwingConstants.CENTER);
		hello.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(hello, BorderLayout.CENTER);
		createMenu();
		
		setSize(400, 350);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb=  new JMenuBar();
		JMenu menu = new JMenu("Text");
		JMenuItem item = new JMenuItem("Color");
		setJMenuBar(mb);
		menu.add(item);
		mb.add(menu);
		
		item.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener {
//		Color selectedColor;
//		
//		public void actionPerformed(ActionEvent e) {
//			selectedColor = JColorChooser.showDialog(null,  "Color", Color.black);
//			
//			if(selectedColor != null) {
//				hello.setForeground(selectedColor);
//			}
//		}
		
		//메뉴 아이템이 많은 경우 !
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();	//명령어 문자열 얻어오기 (메뉴 아이템의 이름 리턴)
			if(cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
				
				if(selectedColor != null) {
					hello.setForeground(selectedColor);
				}
			}
		}
	}

	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}
}