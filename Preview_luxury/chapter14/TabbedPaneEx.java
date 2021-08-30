package chapter14;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame {
	public TabbedPaneEx() {
		setTitle("ÅÇÆÒ ¸¸µé±â ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JTabbedPane pane = createTabbedPane(); //ÅÇÆÒ »ý¼º
		c.add(pane, BorderLayout.CENTER); //ÅÇÆÒ ÄÁÅÙÆ®ÆÒ¿¡ ºÎÂø
		
		setSize(250, 250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(); //ÅÇÆÒ °´Ã¼ »ý¼º
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		
		pane.addTab("tab3", new MyPanel());

		return pane;
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			this.setBackground(Color.yellow);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10,  70, 50, 50);
			g.setColor(Color.black);
			g.drawString("tab 3¿¡ µé¾î°¡´Â JPanel ÀÔ´Ï´Ù.", 30, 50);
		}
	}

	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}