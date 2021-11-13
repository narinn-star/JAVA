package Chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx2 extends JFrame {
	public GraphicsDrawImageEx2() {
		super("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/image0.jpg");
			Image img = icon.getImage();
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}