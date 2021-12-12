package Chapter14;

import java.awt.*;
import javax.swing.*;

public class TabbedPaneEx extends JFrame {
	public TabbedPaneEx() {
		super("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("tab3", new MyPanel());
		
		c.add(pane);
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(5, 5, 60, 60);
			
			g.setColor(Color.blue);
			g.fillOval(5, 100, 60, 60);
			
			g.setColor(Color.black);
			g.drawString("tab 3에 들어가는 JPanel입니다.", 40, 65);
		}
	}

	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}