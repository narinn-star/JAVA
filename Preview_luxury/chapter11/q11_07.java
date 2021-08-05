package chapter11;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class q11_07 extends JFrame {
	private JSlider js = new JSlider(1, 100, 56);
	private JLabel la = new JLabel("I Love Java");
	
	public q11_07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(5);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		js.setPaintTrack(true);
		
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider tmp = (JSlider)e.getSource();
				la.setFont(new Font("Arial", Font.PLAIN, tmp.getValue()));
			}
		});
		
		c.add(js, BorderLayout.NORTH);
		
		la.setFont(new Font("Arial", Font.PLAIN, 56));
		c.add(la, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new q11_07();
	}
}