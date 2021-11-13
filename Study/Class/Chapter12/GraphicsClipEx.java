package Chapter12;

import java.awt.*;
import javax.swing.*;

public class GraphicsClipEx extends JFrame {
	public GraphicsClipEx() {
		super("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			ImageIcon icon = new ImageIcon("images/image0.jpg");
			Image img = icon.getImage();
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.RED);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!", 10, 150);
		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx();
	}
}