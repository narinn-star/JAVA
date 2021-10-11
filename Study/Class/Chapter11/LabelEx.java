package Chapter11;

import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		super("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel love = new JLabel("사랑합니다.");
		
		ImageIcon heart = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(heart);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel la = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		c.add(love);
		c.add(imageLabel);
		c.add(la);
		
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}