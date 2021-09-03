package chapter12;

import java.awt.*;
import javax.swing.*;

public class q12_10 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_10() {
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = this.getWidth();
			int h = this.getHeight();
			int iw = img.getWidth(this);
			int ih = img.getHeight(this);
			
			g.drawImage(img, 0, 0, w / 2 - 5, h / 2 - 5, 0, 0, iw / 2, ih / 2, this);
			g.drawImage(img, w / 2 + 5, 0, w, h / 2 - 5, iw / 2, 0, iw, ih / 2, this);
			g.drawImage(img, 0, h / 2 + 5, w / 2 - 5, h, 0, ih / 2, iw / 2, ih, this);
			g.drawImage(img, w / 2 + 5, h / 2 + 5, w, h, iw / 2, ih / 2, iw, ih, this);
			
		}
	}
	public static void main(String[] args) {
		new q12_10();
	}
}