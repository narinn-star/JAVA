package Chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawStringEx extends JFrame {
	public GraphicsDrawStringEx() {
		super("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바 재미 없엉", 30, 30);
			g.drawString("얼마나 ? 완전 마니", 60, 60);			
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}