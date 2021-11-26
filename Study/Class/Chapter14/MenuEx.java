package Chapter14;

import java.awt.*;
import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		super("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu screenM = new JMenu("Screen");
		
		bar.add(screenM);
		bar.add(new JMenu("Edit"));
		bar.add(new JMenu("Source"));
		bar.add(new JMenu("Project"));
		bar.add(new JMenu("Run"));
		
		screenM.add(new JMenuItem("Load"));
		screenM.add(new JMenuItem("Hide"));
		screenM.add(new JMenuItem("ReShow"));
		screenM.addSeparator();
		screenM.add(new JMenuItem("Exit"));
		
		setJMenuBar(bar);
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}