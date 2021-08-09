package chapter12;

import java.awt.*;
import javax.swing.*;

public class q12_01_01 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	
	public q12_01_01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q12_01_01();
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage(); 
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(img, 0, 0, this);
		}
	}
}