package Chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx1 extends JFrame {
	public GraphicsDrawImageEx1() {
		super("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/image0.jpg");
			Image img = icon.getImage();
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}