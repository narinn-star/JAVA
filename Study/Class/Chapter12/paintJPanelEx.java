package Chapter12;

import java.awt.*;
import javax.swing.*;

public class paintJPanelEx extends JFrame {
	public paintJPanelEx() {
		super("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.magenta);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
