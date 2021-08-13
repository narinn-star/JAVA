package chapter12;

import java.awt.*;
import javax.swing.*;

public class q12_06_02 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public q12_06_02() {
		setTitle("�׷��� �ٰ��� �ǽ�");
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
				
				g.drawLine(calc, halfH, halfW, calc); //���� ���
				g.drawLine(halfW, calc, width - calc, halfH); //������ ���
				g.drawLine(halfW, height - calc, calc, halfH); //���� �ϴ�
				g.drawLine(width - calc, halfH, halfW, height - calc); //������ �ϴ�
			}
		}
	}

	public static void main(String[] args) {
		new q12_06_02();
	}
}