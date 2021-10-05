package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerAllEx extends JFrame {
	JLabel label = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		super("MouseListener¿Í MouseMotionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(label);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			label.setText("MousePressed (" + x + ", " + y + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			label.setText("MouseReleased (" + x + ", " + y + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			label.setText("MouseDragged (" + x + ", " + y + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			label.setText("MouseMoved (" + x + ", " + y + ")");
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}