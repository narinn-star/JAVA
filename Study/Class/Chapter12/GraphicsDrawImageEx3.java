package Chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx3 extends JFrame {
	public GraphicsDrawImageEx3() {
		super("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/image0.jpg");
			Image img = icon.getImage();
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}
}