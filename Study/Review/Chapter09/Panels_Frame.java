package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Panels_Frame extends JFrame {
	public Panels_Frame() {
		super("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		NorthPanel np = new NorthPanel();
		CenterPanel cp = new CenterPanel();
		SouthPanel sp = new SouthPanel();
		
		c.add(np, BorderLayout.NORTH);
		c.add(cp, BorderLayout.CENTER);
		c.add(sp, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.gray);
			add(new JButton("Open"));
			add(new JButton("Close"));
			add(new JButton("Exit"));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			
			for(int i = 0; i < 10; i++) {
				int x = (int)(Math.random() * 250);
				int y = (int)(Math.random() * 170);
				JLabel la = new JLabel("*");
				la.setForeground(Color.black);
				la.setLocation(x, y);
				la.setSize(15, 15);
				la.setOpaque(true);
				add(la);
			}
		}
	}

	class SouthPanel extends JPanel {
		public SouthPanel() {
		setLayout(new FlowLayout());
		setBackground(Color.YELLOW);
		add(new JButton("Integer Input"));
		add(new JTextField(13));
		}
	}

	public static void main(String[] args) {
		new Panels_Frame();
	}
}