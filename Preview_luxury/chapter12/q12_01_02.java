package chapter12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q12_01_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("Hide/Show");
	
	private ImageIcon icon = new ImageIcon("images/back.jpg");
	private Image img = icon.getImage(); 
	
	int cnt = 0;
	
	public q12_01_02() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		add(btn);
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cnt++;
				if(cnt % 2 == 1) {
					img = null;
					repaint();
				}
				else {
					img = icon.getImage();
					repaint();
				}
			}
		});		
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q12_01_02();
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(img, 0, 0, this);
		}
	}
}