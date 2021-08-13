package chapter12;

import javax.swing.*;

import chapter12.GraphicsDrawImageEx1.MyPanel;

import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
	private MyPanel panel = new MyPanel();
		
	public GraphicsDrawImageEx2() {
		setTitle("�г���ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
			
		setSize(200, 300);
		setVisible(true);
	}
		
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//�̹����� �г� ũ��� �����Ͽ� �׸���
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
}

	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}