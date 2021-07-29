package chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class q11_05 extends JFrame {
	private JSlider slider;
	private JLabel la = new JLabel("128");
	public q11_05() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 128);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(0);
		
		slider.addChangeListener(new MyChangeListener());
		c.add(slider);
		
		la.setBackground(Color.green);
		la.setOpaque(true);
		c.add(la);
			
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			int val = slider.getValue();
			la.setText(Integer.toString(val));
		}
	}

	public static void main(String[] args) {
		new q11_05();
	}
}