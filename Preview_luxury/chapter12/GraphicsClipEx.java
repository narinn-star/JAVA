package chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("클리핑 예제");
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
			g.setClip(100, 20, 150, 150); //(100, 20)에서 150x150 부분을 클리핑 영역으로 지정
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this); //이미지를 패널에 꽉 차게 그림. 하지만 클리핑 영역에 해당하는 부분만 화면에 그려짐.
			g.setColor(Color.yellow);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150); //문자열 중 클리핑 영역에 해당하는 부분만 화면에 출력
		}
	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}