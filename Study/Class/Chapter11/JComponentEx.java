package Chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Magenta/Yellow Button");
		JButton btn2 = new JButton("    Disabled Button     ");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.magenta);
		btn1.setFont(new Font("Arial", Font.ITALIC, 20));
		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEx c = (JComponentEx)b.getTopLevelAncestor();
				c.setTitle(b.getX() + ", " + b.getY());
			}
		});
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}