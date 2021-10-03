package Chapter10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel[] label;
	
	public KeyListenerEx() {
		super("keyListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		label = new JLabel[3];
		label[0] = new JLabel("  getKeyCode()  ");
		label[1] = new JLabel("  getKeyChar()  ");
		label[2] = new JLabel("  getKeyText()  ");
		
		for(int i = 0; i < label.length; i++) {
			c.add(label[i]);
			label[i].setOpaque(true);
			label[i].setBackground(Color.YELLOW);
		}
		
		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				label[0].setText(Integer.toString(keyCode));
				label[1].setText(Character.toString(keyChar));
				label[2].setText(KeyEvent.getKeyText(keyCode));
				
				System.out.println("KeyPressed");
			}
			
			public void keyReleased(KeyEvent e) {
				System.out.println("KeyReleased");
			}
			
			public void keyTyped(KeyEvent e) {
				System.out.println("KeyTyped");
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
