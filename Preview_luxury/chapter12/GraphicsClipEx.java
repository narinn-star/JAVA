package chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("Ŭ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150); //(100, 20)���� 150x150 �κ��� Ŭ���� �������� ����
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this); //�̹����� �гο� �� ���� �׸�. ������ Ŭ���� ������ �ش��ϴ� �κи� ȭ�鿡 �׷���.
			g.setColor(Color.yellow);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150); //���ڿ� �� Ŭ���� ������ �ش��ϴ� �κи� ȭ�鿡 ���
		}
	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}