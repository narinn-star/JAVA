package chapter12;

import java.awt.*;
import javax.swing.*;

public class q12_06_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_06_02() {
		setTitle("그래픽 다각형 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			int cnt = 10;
			for(int i = 0; i < 10; i++) {
				int halfW = this.getWidth() / 2;
				int halfH = this.getHeight() / 2;
				int width = this.getWidth();
				int height = this.getHeight();
				int calc = cnt * i;
				
				g.drawLine(calc, halfH, halfW, calc); //왼쪽 상단
				g.drawLine(halfW, calc, width - calc, halfH); //오른쪽 상단
				g.drawLine(halfW, height - calc, calc, halfH); //왼쪽 하단
				g.drawLine(width - calc, halfH, halfW, height - calc); //오른쪽 하단
			}
		}
	}

	public static void main(String[] args) {
		new q12_06_02();
	}
}