package Chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSlider_Practice extends JFrame {
	public JSlider_Practice() {
		super("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel();
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 100, 200, 128);
		sl.setPaintLabels(true);
		sl.setPaintTrack(true);
		sl.setPaintTicks(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(0);
		sl.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				la.setText(Integer.toString(sl.getValue()));
				c.add(la);
			}
		});
		
		la.setBackground(Color.green);
		la.setOpaque(true);
		c.add(sl);
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSlider_Practice();
	}
}