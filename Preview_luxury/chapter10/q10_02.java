package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q10_02 extends JFrame{
	public q10_02() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setBackground(Color.green);
		
		ML listener = new ML();
		p.addMouseMotionListener(listener);
		this.add(p);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class ML implements MouseMotionListener{
		public void mouseDragged(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.yellow);
		}

		public void mouseMoved(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new q10_02();
	}
}